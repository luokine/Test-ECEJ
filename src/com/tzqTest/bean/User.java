package com.tzqTest.bean;

import lombok.Data;

/**
 * @author: tiantziquan
 * @create: 2019-07-10 11:28
 */
public class User {
    private String name;
    private Integer age;
    private String no;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no='" + no + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
