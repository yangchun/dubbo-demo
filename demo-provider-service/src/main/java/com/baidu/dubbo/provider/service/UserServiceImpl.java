package com.baidu.dubbo.provider.service;

import com.baidu.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public String getUserName() {
        return "test";
    }
}
