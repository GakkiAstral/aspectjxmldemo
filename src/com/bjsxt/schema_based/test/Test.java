package com.bjsxt.schema_based.test;

import com.bjsxt.schema_based.service.BasedUsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextBased.xml");
        BasedUsersService basedUsersService = (BasedUsersService)applicationContext.getBean("basedUsersService");
        basedUsersService.addUsers("oldlu");
    }
}
