package com.lxh.service;

import com.lxh.po.Stu;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
public interface StuService {
    public List<Stu> getAllStu();

}
