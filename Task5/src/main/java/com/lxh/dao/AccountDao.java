package com.lxh.dao;

import com.lxh.po.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountDao {
    Account doLogin(@Param("username")String username,@Param("password")String password);
    boolean doRegister(Account account);
    Account doGetByUser_id(int user_id);
    Account doGetAll();

}
