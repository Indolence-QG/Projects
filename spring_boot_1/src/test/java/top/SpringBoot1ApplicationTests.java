package top;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.indolence.domain.User;
import top.indolence.mapper.UserMapper;

@SpringBootTest
class SpringBoot1ApplicationTests {

    @Test
    void testSelect(){
        User user = new User();
      user.setId(1);
      user.setUsername("1");
      user.setPassword("1");
        System.out.println(user);
    }


}
