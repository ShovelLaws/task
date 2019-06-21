package com.lxh.service;

import com.lxh.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUser();
    public boolean getUser(int id);
    public boolean deleteUser(int id);
    public boolean insertUser(User user);
    public boolean updateUser(User user);
}
