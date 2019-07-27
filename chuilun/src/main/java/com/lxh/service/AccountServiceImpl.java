package com.lxh.service;

import com.lxh.dao.AccountDao;
import com.lxh.pojo.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;
    public List<Account> doGetAll() {
        return accountDao.doGetAll();
    }

    public List<Account> doGetIdList(List<Integer> ids){
        return accountDao.doGetByAccountIds(ids);
    }

    public List<Account> doGetById(int id) {
        return accountDao.doGetById(id);
    }

    public Account doLogin(Account account){
        return accountDao.doLogin(account);
    }

    public boolean doSetPassword(String password,int id){
        return accountDao.doSetPassword(password,id);
    }

    public boolean doUpdate(Account account) {
        return accountDao.doUpdate(account);
    }

    public boolean doCreate(Account account) {
        return accountDao.doCreate(account);
    }

    public boolean doDelete(int id) {
        return accountDao.doDelete(id);
    }
}
