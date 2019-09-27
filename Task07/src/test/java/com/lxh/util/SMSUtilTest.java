//package com.lxh.util;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.Random;
//
//import static org.junit.Assert.*;
//
//public class SMSUtilTest {
//    SMSUtil smsUtil;
//    @Before
//    public void init() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        smsUtil = applicationContext.getBean(SMSUtil.class);
//    }
//    @Test
//    public void sendMessage() {
//        String phone = "13281234352";
//        String verifyCode= String.valueOf(new Random().nextInt(8999999)+100000);
//        smsUtil.sendMessage(phone,verifyCode);
//    }
//}