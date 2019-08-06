package com.lxh.dao;

import com.lxh.po.Stu;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StuMapper {
    public List<Stu> getAllStu();

}