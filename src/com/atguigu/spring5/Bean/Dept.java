package com.atguigu.spring5.Bean;

public class Dept {

    @Override
    public String toString() {
        return "Dept{" +
                "dept=" + dname +
                '}';
    }

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

}
