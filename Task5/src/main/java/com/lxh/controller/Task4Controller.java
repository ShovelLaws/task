package com.lxh.controller;


import com.lxh.po.Account;
import com.lxh.po.Profession;
import com.lxh.po.Stu;
import com.lxh.service.AccountService;
import com.lxh.service.ProfessionService;
import com.lxh.service.StuService;
import com.lxh.util.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

@Controller
public class Task4Controller {
    @Autowired
    StuService stuService;
    @Autowired
    ProfessionService professionService;
    @Autowired
    AccountService accountService;
    //首页
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getAllStu(ModelMap modelMap){
        List<Stu> stus = stuService.getAllStu();
        stus.subList(0,4);
        modelMap.addAttribute("stus",stus);
        return "home" ;
    }
    //职业
    @RequestMapping(value = "/profession",method = RequestMethod.GET)
    public String getAllProfession(ModelMap modelMap){
        List<Profession> professions = professionService.getAllProfession();
        modelMap.addAttribute("professions",professions);
        return "profession" ;
    }
    //调出登录页面
    @RequestMapping(value = "/getLogin",method = RequestMethod.GET)
    public String getLogin(){
        return "login";
    }
    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String doLogin(@RequestParam ("username")String username, @RequestParam("password")String password, HttpServletResponse response,ModelMap modelMap)throws Exception{
        Account account = accountService.doLogin(username, password);
        if(account!=null){
            String value = account.getId()+"/"+account.getNickname();
            String token = DESUtil.desDecript(value);
            Cookie cookie = new Cookie("token",token);
            cookie.setMaxAge(60*20*24*10);
            cookie.setPath("/");
            response.addCookie(cookie);
            modelMap.addAttribute("account",account);
            return "redirect:/home";
        }
        return "result";
    }
    //获取注册页面
    @RequestMapping(value = "/getRegister",method = RequestMethod.GET)
    public String getRegister(){
        return "register";
    }
    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String doRegister(@RequestParam("nickname")String nickname,@RequestParam("username")String username,@RequestParam("password")String password) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        Account account = new Account();
        account.setNickname(nickname);
        account.setUsername(username);
        account.setPassword(DESUtil.desEncript(password));
        account.setCreate_at(System.currentTimeMillis());
        if(accountService.doRegister(account)){
            return "redirect:/home";
        }
        return "result";
    }
    //登出
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("token")){
                cookie.setValue(null);
                cookie.setMaxAge(0);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        }
        return "redirect:/home";
    }
    @RequestMapping(value = "result",method = RequestMethod.GET)
    public String errResult(){
        return "result";
    }

}
