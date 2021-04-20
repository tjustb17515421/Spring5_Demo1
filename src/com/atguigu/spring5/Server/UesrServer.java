package com.atguigu.spring5.Server;

import com.atguigu.spring5.Dao.UserDao;

public class UesrServer {

    private UserDao userDao;

    public void setUserDao(UserDao userDao)
    {
        this.userDao=userDao;
    }

    public void add()
    {
        System.out.println("Server--add");
        userDao.updata();
    }
}
