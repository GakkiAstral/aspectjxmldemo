package com.bjsxt.aspectj.service.impl;

import com.bjsxt.aspectj.service.UsersService;

public class UsersServiceImpl implements UsersService {
    @Override
    public void addUsers(String username) {
        System.out.println("AddUsers " + username);
    }
}
