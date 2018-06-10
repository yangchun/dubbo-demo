package com.test;

import com.baidu.dubbo.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer");
        System.out.println(userService.getUserName());
    }
}
