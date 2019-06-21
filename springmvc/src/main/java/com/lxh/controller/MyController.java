package com.lxh.controller;

import com.lxh.po.Result;
import com.lxh.po.User;
import com.lxh.po.UserResult;
import com.lxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
@RequestMapping("/a")
public class MyController {
    @Autowired
    UserService userService;
    @Autowired
    Result result;
    @Autowired
    UserResult userResult;
    @Autowired
    MessageSource messageSource;
    @Autowired
    User user;
    int code;

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public String insertUser(@RequestParam("name")String name,@RequestParam("age")int age,ModelMap modelMap){
        user.setName(name);
        user.setAge(age);
        if(user.getAge()!=0&&user.getName()!=null){
            code = userService.insertUser(user)?0:-300;
            modelMap.addAttribute("code",code);
            return "result";
        }else{
            code = -300;
            modelMap.addAttribute("code",code);
            return "result";
        }
    }

    @RequestMapping(value  = "/student",method = RequestMethod.GET)
    public String getUser(ModelMap modelMap){
        try{
            List<User> userList = userService.getAllUser();
            if(userList.size()!=0){
                code = 0;
                modelMap.addAttribute("userList",userList);
                modelMap.addAttribute("code",code);
                return "userlist";
            }else{
                code = -101;
                modelMap.addAttribute("code",code);
                return "result";
            }

        }catch(Exception e){
            code = -1000;
            modelMap.addAttribute("code",code);
            return "result";
        }
    }
    @ResponseBody
    @RequestMapping(value = "student1",method = RequestMethod.GET)
    public UserResult getUserResult(ModelMap modelMap){
        try{
            List<User> userList = userService.getAllUser();
            if(userList.size()!=0){
                String codex = "0" ;
                userResult.setCode(Integer.parseInt(codex));
                userResult.setMessage(messageSource.getMessage(codex,null,null));
                userResult.setData(userList);
                return userResult;
            }else {
                String codex = "-101" ;
                userResult.setCode(Integer.parseInt(codex));
                userResult.setMessage(messageSource.getMessage(codex,null,null));
                return userResult;
            }
        }catch (Exception e){
            String codex = "-1000" ;
            userResult.setCode(Integer.parseInt(codex));
            userResult.setMessage(messageSource.getMessage(codex,null,null));
            return userResult;
        }

    }
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id) ;

        if (id != 0) {
            code = 0;
            ModelAndView mav = new ModelAndView("result", "code", code);
            return mav;
        } else {
            code = -200;
            ModelAndView mav = new ModelAndView("result", "code", code);
            return mav;
        }
    }
    @ResponseBody
    @RequestMapping(value = "/student/{id}" ,method = RequestMethod.PUT)
    public Result updateUser(@PathVariable("id")int id, @RequestParam("name")String name,@RequestParam("age")int age,ModelMap modelMap){
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        String codex = userService.updateUser(user)?"0":"-500";
        result.setCode(Integer.parseInt(codex));
        result.setMessage(messageSource.getMessage(codex,null,null));
        return result;
    }
}
