package com.tzqTest.test.exception;

import com.tzqTest.bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: tianziquan
 * @create: 2019-08-20 10:08
 */
public class TestException {

    public static void main(String[] args) {
        int i=0;
        if(i<1){
            throw new RuntimeException("测试异常");
        }
        System.out.println("i = " + i);
    }

    @Test
    public void testEx(){
        Map<String, User> userMap=new HashMap<>();
        User user=new User();
        user.setNo(1);
        user.setName("zds111");
        user.setAge(1);
        List<User> userList=new ArrayList<>();
        userList.add(user);
        User user1=new User();
        user1.setNo(2);
        user1.setName("zds222");
        user1.setAge(2);
        userList.add(user1);
        Map<String, User> collect = userList.stream().collect(Collectors.toMap(User::getName, po -> po, (key, key2) -> key2));
        User zds1114 = collect.get("zds1114");
        if(zds1114!=null){
        Integer zds111 = zds1114.getAge();
        System.out.println("zds111 = " + zds111);
        }
        System.out.println("123213 = " + 123213);
    }
}
