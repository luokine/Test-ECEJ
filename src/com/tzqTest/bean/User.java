package com.tzqTest.bean;

import lombok.Data;

/**
 * @author: tianziquan
 * @create: 2019-07-10 11:28
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Integer no;

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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
}
