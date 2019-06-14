package com.lxh.dao;

import com.lxh.po.User;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface UserDao {
    public List<User> getAllUser();
    public void getUser(int id);
    public void deleteUser(int id);
    public void insertUser(User user);
    public boolean updateUser(User user);
}
