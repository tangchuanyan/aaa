package cn.itcast.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUser {
//
//    @Autowired
//    private UserService userService;

    @Test
    public void testUser(){
//        1 加载spring配置文件，根据创建对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 得到配置创建的对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

//        userService.add();

    }
}
