package com.lxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest{
    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest ,
                                      javax.servlet.http.HttpServletResponse httpServletResponse)throws Exception{
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message","Hello SpringMVC");
        return modelAndView;
    }
    @RequestMapping("/do")
    public @ResponseBody String handleString (javax.servlet.http.HttpServletRequest httpServletRequest,
                                              javax.servlet.http.HttpServletResponse httpServletResponse)throws Exception{
        String str = "WOW!";
        return str;
    }


}
