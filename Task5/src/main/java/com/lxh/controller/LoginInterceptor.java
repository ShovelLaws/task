package com.lxh.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandler(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0){
            for(Cookie cookie:cookies){
                System.out.println(cookie.getName()+"---"+cookie.getValue());
                if("token".equals(cookie.getName())){
                    System.out.println("用户已登录！");
                    return true;
                }
            }
            System.out.println("用户未登录！");
            response.sendRedirect(request.getContextPath()+"/result");
            return false;
        }
        System.out.println("no cookie get");
        response.sendRedirect(request.getContextPath()+"/result");
        return false;
    }
    public void postHandler(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception{}

    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex)throws Exception{}

}