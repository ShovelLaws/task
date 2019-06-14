package Service;

import mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import po.user;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private userMapper userMapper;
    @Override
    public void insertUser(user user){
        userMapper.insertUser(user);
    }
    @Override
    public void deleteUser(int id ){}
    @Override
    public user getUser(int id){
        return userMapper.getUser(id);
    }
    @Override
    public void updateUser(user user){
        userMapper.updateUser(user);
    }
    public static void main (String[]args){
        System.out.println("Hello World!");
    }

}
