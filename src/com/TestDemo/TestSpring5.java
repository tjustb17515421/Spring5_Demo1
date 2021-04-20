package com.TestDemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    /*
    public void testAdd()
    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        User user=context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }
    */
    /*
    public void testBook()
    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        Book book=context.getBean("book", Book.class);
        System.out.println(book);
        book.show();

    }

     */
    public void testOrders()
    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders=context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.show();

    }
}
