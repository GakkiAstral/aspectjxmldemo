package com.bjsxt.schema_based.service.impl;

import com.bjsxt.schema_based.service.BasedUsersService;

public class BasedUsersServiceImpl implements BasedUsersService {
    @Override
    public void addUsers(String username) {
        System.out.println("AddUsers……"+username);
    }
}
