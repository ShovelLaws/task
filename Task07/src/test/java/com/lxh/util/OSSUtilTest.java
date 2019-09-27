//package com.lxh.util;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.io.File;
//
//import static org.junit.Assert.*;
//
//public class OSSUtilTest {
//    OSSUtil ossUtil;
//    @Before
//    public void init(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        ossUtil = applicationContext.getBean(OSSUtil.class);
//    }
//    @Test
//    public void upLoadFile() throws Exception {
//        File file = new File("C:/Users/Administrator/Desktop/saber.jpg");
//        ossUtil.upLoadFile("test",file);
//    }
//}