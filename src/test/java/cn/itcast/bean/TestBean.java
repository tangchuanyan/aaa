package cn.itcast.bean;

import cn.itcast.bean.Bean3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testUser() {
        //1 加载spring配置文件，根据创建对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 得到配置创建的对象
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        System.out.println(bean2);
    }
}
