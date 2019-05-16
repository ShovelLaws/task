package Service;

import mapper.userMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.user;
import java.io.IOException;


public class userServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUserTest() throws IOException{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        userService=context.getBean(UserServiceImpl.class);
        for(int a = 0; a < 10; a++){
          user user = new user();
          user.setName("NPC" + a );
          user.setAge(13);
          try{
          userService.insertUser(user);}
          catch(Exception e) {e.printStackTrace();}
        }
    }
}