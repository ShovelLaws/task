package com.lxh.service;

import com.lxh.dao.AccountDao;
import com.lxh.po.Account;
import com.lxh.util.DESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountDao accountDao;
    @Override
    public Account doLogin(String username,String pwd) throws Exception {
        String password = DESUtil.desDecript(pwd);
        return accountDao.doLogin(username,password);
    }
    public boolean doRegister(Account account){
        return accountDao.doRegister(account);
    }
    public Account doGetByUser_id(int user_id){
        return accountDao.doGetByUser_id(user_id);
    }
    public Account doGetAll(){
        return accountDao.doGetAll();
    }
}
