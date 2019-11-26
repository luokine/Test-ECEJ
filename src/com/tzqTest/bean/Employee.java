package com.tzqTest.bean;

import java.util.Date;

/**
 * @author: tianziquan
 * @create: 2019-08-09 11:31
 */
public class Employee {
    private Long id;
    private String name;
    private Integer age;
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date re;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", re=" + re +
                '}';
    }

    public Date getRe() {
        return re;
    }

    public void setRe(Date re) {
        this.re = re;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
