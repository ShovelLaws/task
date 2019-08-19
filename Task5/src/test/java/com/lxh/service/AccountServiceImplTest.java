package com.lxh.service;

import com.lxh.dao.AccountDao;
import com.lxh.po.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmvc.xml")
public class AccountServiceImplTest {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private Account account;

    @Test
    public void testDoLogin() {
        account = accountDao.doLogin("xc","12138");
        System.out.println(account);
    }
//    @Test
//    public void testDo() {
//        List list = accountDao.doGetAll();
//        System.out.println(list);
//    }
}