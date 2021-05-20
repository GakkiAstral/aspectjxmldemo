package com.bjsxt.aspectj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    /**
     * 前置通知
     * @param joinPoint 对目标对象的封装
     */
    public void myBefore(JoinPoint joinPoint){
        //joinPoint.getTarget();获取目标对象
        //joinPoint.getSignature().getName();获取目标方法名
        //joinPoint.getArgs();获取目标方法参数列表
        //joinPoint.getThis();获取代理对象
        System.out.println("Before "+joinPoint.getSignature().getName());
    }

    /**
     * 后置通知
     * @param joinPoint
     */
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("After "+joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Around Before "+proceedingJoinPoint.getSignature().getName());
        Object object = proceedingJoinPoint.proceed();
        System.out.println("After Before "+proceedingJoinPoint.getSignature().getName());
        return object;
    }

    /**
     * 异常通知类型
     * @param ex
     */
    public void myAfterThrowing(Exception ex){
        System.out.println("Exception "+ex);
    }

    /**
     * 最终通知
     */
    public void myAfter(){
        System.out.println("最终通知");
    }
}
