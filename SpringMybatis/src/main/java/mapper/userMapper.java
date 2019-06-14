package mapper;

import org.springframework.stereotype.Component;
import po.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Component
public interface userMapper{
    public void insertUser(user user);
    public void deleteUser(int id);
    public user getUser(int id);
    public void updateUser(user user);

}
