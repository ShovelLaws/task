package Service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import po.user;
import mapper.userMapper;

import java.util.List;

public interface UserService {
   public void insertUser(user user);
   public void deleteUser(int id);
   public user getUser(int id);
   public void updateUser(user user);

}
