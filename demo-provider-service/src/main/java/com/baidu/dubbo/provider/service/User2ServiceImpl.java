package com.baidu.dubbo.provider.service;

import com.baidu.dubbo.api.UserService;

public class User2ServiceImpl implements UserService {
    public String getUserName() {
        return "user2";
    }
}
