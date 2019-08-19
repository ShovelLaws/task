package com.lxh.service;

import com.lxh.po.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {
    Account doLogin(@Param("account")String username, @Param("password")String password) throws Exception;
    boolean doRegister(Account account);
    Account doGetByUser_id(int user_id);
    Account doGetAll();
}
