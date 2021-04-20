package com.atguigu.spring5.Bean;

public class Emp {
    private String pnaem;
    private String gender;

    public Dept getDept() {
        return dept;
    }

    private Dept dept;
    public void setPnaem(String pnaem) {
        this.pnaem = pnaem;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void show()
    {
        System.out.println(pnaem+"-"+gender+"-"+dept);
    }
}
