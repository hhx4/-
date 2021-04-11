package com.study.test;

import com.study.pojo.User;
import com.study.service.UserService;
import com.study.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTestTest {

    UserService userService = new UserServiceImpl();
//    @Test
//    public void registUser() {
//        userService.registUser(new User(null,"bbj168","666666","bbj@168.com"));
//        userService.registUser(new User(null,"asd168","666666","asdj@168.com"));
//    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"admin123","admin",null)));
    }

//    @Test
//    public void existsUsername() {
//        if (userService.existsUsername("wzg16888")) {
//            System.out.println("用户名已存在！");
//        } else {
//            System.out.println("用户名可用！");
//        }
//    }
}