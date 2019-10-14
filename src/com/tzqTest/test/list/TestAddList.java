package com.tzqTest.test.list;

import com.tzqTest.bean.User;

import javax.lang.model.SourceVersion;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: tiantziquan
 * @create: 2019-07-10 11:29
 */
public class TestAddList {
    public static void main(String[] args) {
        User user1=new User();
        user1.setAge(12);
        user1.setName("luokine");
        System.out.println("user1 = " + user1);
        List<User> userList1=new LinkedList<>();
        userList1.add(user1);
        System.out.println("userList1 = " + userList1);
        User user2=new User();
        user2.setAge(13);
        user2.setName("luokine2");
        List<User> userList2=new LinkedList<>();
        userList2.add(user2);
        System.out.println("userList2 = " + userList2);
        userList1.addAll(userList2);
        System.out.println("userList2 = " + userList2);
        System.out.println("userList1-1= " + userList1);
    }
}
