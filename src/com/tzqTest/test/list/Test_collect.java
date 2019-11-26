package com.tzqTest.test.list;

import com.tzqTest.bean.User;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: tianziquan
 * @create: 2019-07-18 10:23
 */
public class Test_collect {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setAge(12);
        user1.setName("luokine");
        user1.setNo(1);
        user2.setNo(2);
        user2.setAge(13);
        user2.setName("luokine2");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        System.out.println("userList = " + userList);
        System.out.println("userList = " + userList);
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(001,"小明");
        userMap.put(002,"小红");
        userMap.put(003,"小百");
        String s = userMap.get(004);
        System.out.println("s = " + s);

        CollectionUtils.isEmpty(userList);

    }
}
