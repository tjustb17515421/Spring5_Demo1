package com.TestDemo;

import com.atguigu.spring5.Server.UesrServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbean2 {
    @Test

    public void testUser() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UesrServer uesrServer=context.getBean("userServer",UesrServer.class);
        uesrServer.add();
    }
}
