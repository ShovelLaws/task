package com.lxh.service;

import com.lxh.dao.StuMapper;
import com.lxh.po.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    StuMapper stuMapper;
    public List<Stu> getAllStu() {
        return stuMapper.getAllStu();
    }
}
