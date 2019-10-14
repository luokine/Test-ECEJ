package com.tzqTest.test.map;

import com.google.common.collect.Lists;
import com.tzqTest.bean.User;
import com.tzqTest.test.list.DemoList;
import org.apache.commons.collections.list.AbstractListDecorator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: tiantziquan
 * @create: 2019-08-29 13:08
 */
public class TestMap {

    public static void main(String[] args) {
        TestMap nap=new TestMap();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 123);
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 1);
        List<Integer> idList=new ArrayList<>();
        idList = nap.getDeptNodeIdList(0, map, idList);
        System.out.println("idList = " + idList);
    }
    private List<Integer> getDeptNodeIdList(Integer deptId, Map<Integer, Integer> deptIdMap, List<Integer> idList) {
        for (Integer item : deptIdMap.keySet()) {
            if(deptId == deptIdMap.get(item)){
                idList.add(item);
                getDeptNodeIdList(item,deptIdMap,idList);
            }
        }
        return idList;
    }
    /**
     * 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
     */
    @Test
    public void testMap1(){

        Map<Integer, Integer> map = new HashMap<>();
        map.put(111, 1);
        map.put(222, 2);
        for (Integer integer : map.keySet()) {
            Integer integer1 = map.get(integer);
            System.out.println("integer1-1 = " + integer1);
            System.out.println("integer:"+integer);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            System.out.println(mapKey + ":" + mapValue);
        }
        String [] str=new String[]{"123","456"};
        Lists.newArrayList(str);
    }
    @Test
    public void testToList(){
        String [] str=new String[]{"123","456"};
        System.out.println("str = " + str);
        for (String s : str) {
            System.out.println("调用短信服务 = " + s);
        }

        ArrayList<String> strings = Lists.newArrayList(str);
        System.out.println("strings = " + strings);
        strings.forEach(item->{
            System.out.println("调用短信服务 = " + item);
        });
    }

    @Test
    public void testFil(){
        User user=new User();
        user.setName("111");
        user.setAge(12);
        User user2=new User();
        user2.setName("222");
        user2.setAge(15);
        List<User> userList=Lists.newArrayList();
        userList.add(user);
        userList.add(user2);
        List<User> list = userList.stream().filter(a ->
                a.getAge().equals(12)).collect(Collectors.toList());
        System.out.println("list = " + list);
    }
}
