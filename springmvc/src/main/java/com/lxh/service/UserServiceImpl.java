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
    public boolean getUser(int id) {
        return  userDao.getUser(id);
    }
    public boolean insertUser(User user){
        return userDao.insertUser(user);
    }
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }
    public boolean deleteUser(int id){
        return userDao.deleteUser(id);
    }
}
