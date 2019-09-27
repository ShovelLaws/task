package com.lxh.dao;

import com.lxh.po.Stu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public interface StuDao {
    boolean doRegisterByPhone(Stu stu);
    boolean doRegisterByEmail(Stu stu);
    Stu doLoginByUsername(@Param("username")String username,@Param("password")String password);
    Stu doLoginByPhone(@Param("phone")int phone,@Param("password")String password);
    Stu doLoginByEmail(@Param("email")String email,@Param("password")String password);
}
