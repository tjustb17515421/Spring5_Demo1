package com.TestDemo;



import com.atguigu.spring5.Bean.Emp;
import com.atguigu.spring5.Server.UesrServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test

    public void testUser() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp=context.getBean("emp",Emp.class);
        emp.show();
    }
}
