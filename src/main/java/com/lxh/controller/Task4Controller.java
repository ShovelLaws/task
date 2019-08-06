package com.lxh.controller;


import com.lxh.po.Profession;
import com.lxh.po.Stu;
import com.lxh.service.ProfessionService;
import com.lxh.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class Task4Controller {
    @Autowired
    StuService stuService;
    @Autowired
    ProfessionService professionService;
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String getAllStu(ModelMap modelMap){
        List<Stu> stus = stuService.getAllStu();
        stus.subList(0,4);
        modelMap.addAttribute("stus",stus);
        return "home" ;
    }
    @RequestMapping(value = "/profession",method = RequestMethod.GET)
    public String getAllProfession(ModelMap modelMap){
        List<Profession> professions = professionService.getAllProfession();
        modelMap.addAttribute("professions",professions);
        return "profession" ;
    }

}
