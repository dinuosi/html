package cn.tedu.boot32;

import cn.tedu.boot32.entity.User;
import cn.tedu.boot32.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Boot32ApplicationTests {

    @Autowired
    UserMapper mapper;

    @Test
    void contextLoads() {
        User u = new User();
        u.setUsername("liudehua");
        u.setPassword("aaabbb");
        u.setNick("刘德华");
        mapper.insert(u);
    }

    @Test
    void Test01() {
        User u = mapper.selectByUsername("liudehua");
        System.out.println(u);
    }

    @Test
    void Test02() {
        mapper.delete(8);
    }

}
