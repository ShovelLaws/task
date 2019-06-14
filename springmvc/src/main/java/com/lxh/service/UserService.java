package com.lxh.service;

import com.lxh.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUser();
    public void getUser(int id);
    public void deleteUser(int id);
    public void insertUser(User user);
    public boolean updateUser(User user);
}
