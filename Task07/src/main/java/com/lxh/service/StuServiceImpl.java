package com.lxh.service;

import com.lxh.dao.StuDao;
import com.lxh.po.Stu;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Reference
    StuDao stuDao;
    public boolean doRegisterByPhone(Stu stu){
        return stuDao.doRegisterByPhone(stu);
    }
    public boolean doRegisterByEmail(Stu stu){
        return stuDao.doRegisterByEmail(stu);
    }
    public Stu doLoginByUsername(@Param("username")String username,@Param("password")String password){
        return stuDao.doLoginByUsername(username, password);
    }
    public Stu doLoginByPhone(@Param("phone")int phone,@Param("password")String password){
        return stuDao.doLoginByPhone(phone, password);
    }
    public Stu doLoginByEmail(@Param("email")String email,@Param("password")String password){
        return stuDao.doLoginByEmail(email, password);
    }

}
