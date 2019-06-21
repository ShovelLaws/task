package com.lxh.dao;

import com.lxh.po.User;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface UserDao {
    public List<User> getAllUser();
    public boolean getUser(int id);
    public boolean deleteUser(int id);
    public boolean insertUser(User user);
    public boolean updateUser(User user);
}
