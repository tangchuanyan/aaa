package cn.itcast.ioc;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void add() {
        System.out.println("dao.........");
    }
}
