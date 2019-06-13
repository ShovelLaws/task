package com.lxh.service;

import com.lxh.dao.UserDao;
import com.lxh.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public List<User> getAllUser(){return userDao.getAllUser();};
    public void getUser(int id) {
        userDao.getUser(id);
    }
    public void insertUser(User user){
        userDao.insertUser(user);
    }
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
}
