package com.lxh.dao;

import com.lxh.pojo.po.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountDao {
    List<Account> doGetAll();
    List<Account> doGetById(int id);
    List<Account> doGetByAccountIds(@Param("ids") List<Integer> ids);
    Account doLogin(Account account);
    boolean doSetPassword(@Param("password") String password,@Param("id")int id);
    boolean doUpdate(Account account);
    boolean doCreate(Account account);
    boolean doDelete(int id);
}
