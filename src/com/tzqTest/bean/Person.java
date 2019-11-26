package com.tzqTest.bean;

import java.util.List;

/**
 * @author: tianziquan
 * @create: 2019-07-18 11:16
 */
public class Person {
    private String perName;
    List<User> userList;

    @Override
    public String toString() {
        return "Person{" +
                "perName='" + perName + '\'' +
                ", userList=" + userList +
                '}';
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
