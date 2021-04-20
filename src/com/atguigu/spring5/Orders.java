package com.atguigu.spring5;

public class Orders {
    private String oname;
    private String oaddress;

    Orders(String oname,String oaddress)
    {
        this.oname=oname;
        this.oaddress=oaddress;
    }

    //测试代码
    public void show()
    {
        System.out.println(oname+"::"+oaddress);
    }
}
