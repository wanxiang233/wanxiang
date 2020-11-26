package com.clothesPlatform;

import com.clothesPlatform.entity.User;
import com.clothesPlatform.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class ClothesPlatformApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    DataSource dataSource;
    @Test
    public void cha(){
        List<User> users=userRepository.findAll();
        users.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserId("10011");
        user.setPassword("11001");
        userRepository.save(user);
    }

    @Test
    public void testDataSource() throws SQLException {
        System.out.println("数据库为----" + dataSource.getClass());
        System.out.println("数据库连接为----" + dataSource.getConnection());
    }
}
