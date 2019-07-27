package com.lxh.service;

import com.lxh.pojo.po.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountService {
    List<Account> doGetAll();
    List<Account> doGetById(int id);
    List<Account> doGetIdList(List<Integer> ids);
    Account doLogin(Account account);
    boolean doSetPassword(String password,int id);
    boolean doUpdate(Account account);
    boolean doCreate(Account account);
    boolean doDelete(int id);
}