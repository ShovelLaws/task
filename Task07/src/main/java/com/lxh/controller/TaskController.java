package com.lxh.controller;

import com.lxh.po.Stu;
import com.lxh.service.StuService;
import com.lxh.util.MailUtil;
import com.lxh.util.OSSUtil;
import com.lxh.util.SMSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Controller
public class TaskController {
    @Autowired
    private StuService stuService;
    @Autowired
    private SMSUtil smsUtil;
    @Autowired
    private MailUtil mailUtil;
    @Autowired
    private OSSUtil ossUtil;
    @Autowired
    private RedisTemplate redisTemplate;

    //发送验证码
    @RequestMapping(value = "/sendVerifyCode",method = RequestMethod.GET)
    public String sendVerifyCode(@RequestParam("phone")String phone){
        String verifyCode = String.valueOf(new Random().nextInt(8999999)+100000);
        smsUtil.sendMessage(phone,verifyCode);
        redisTemplate.opsForValue().set("verifyCode",verifyCode,120, TimeUnit.SECONDS);
       return "result";
    }
    //获取手机注册页面
    @RequestMapping(value = "/getPhoneRegister",method = RequestMethod.GET)
    public String getPhoneRegister(){
        return "phoneRegister";
    }
    @RequestMapping(value = "/phoneRegister",method = RequestMethod.POST)
    public String doLoginByPhone(@RequestParam("photo")String photo,@RequestParam("username")String username,@RequestParam("phone")String phone,@RequestParam("password")String password,@RequestParam("code")String code)throws Exception{
        if(code.equals(redisTemplate.getExpire("verifyCode"))){
        Stu stu = new Stu();
        stu.setPhoto(photo);
        stu.setUsername(username);
        stu.setPassword(password);
        stu.setPhone(phone);
        File file = new File(photo);
        ossUtil.upLoadFile("photo",file);
        stuService.doRegisterByPhone(stu);
       }
        else {
            return "result";
        }
        return "home";
    }
//    @RequestMapping(value = "/uploadPhoto",method =RequestMethod.POST)
//    public String uploadPhoto(String name, File file){
//
//        return "home";
//    }

}
