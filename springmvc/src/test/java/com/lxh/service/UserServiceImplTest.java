package com.lxh.service;

import com.lxh.po.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
        userService = (UserService)context.getBean(UserServiceImpl.class);
        User user = new User();
        user.setName("TICO");
        user.setAge(14);
        userService.insertUser(user);
        System.out.println(user);
    }
}