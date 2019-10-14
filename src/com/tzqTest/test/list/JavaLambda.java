package com.tzqTest.test.list;

import com.alibaba.fastjson.JSON;
import com.tzqTest.bean.DeptDo;
import com.tzqTest.bean.Employee;
import com.tzqTest.bean.GetBeanList;
import com.tzqTest.bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: tiantziquan
 * @create: 2019-07-10 11:27
 */
public class JavaLambda {

    @Test
    public void testList() {
        User user1 = new User();
        User user2 = new User();
        user1.setAge(12);
        user1.setName("luokine");
        user1.setNo("001");
        user2.setNo("002");
        user2.setAge(13);
        user2.setName("luokine2");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        int i = 0;
        for (User user : userList) {

//            User user3 = userList.get(i++);
//            System.out.println(user3);
            System.out.println("i++:" + ++i);
        }
    }

    @Test
    public void testEntity() {
        Employee employee = new Employee();
        employee.setId(employee.getId());
        System.out.println("employee+employee.getId() = " + employee + employee.getId());
    }

    @Test
    public void addList() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break;
                }
                num++;
            }
        }
        System.out.println("num = " + num);
    }

    @Test
    public void distinctList() {
        DemoList demoList = new DemoList();
        List<Integer> integerList = demoList.buildList();
        System.out.println("integerList = " + integerList);
        List<Integer> distinct = demoList.buildList().stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct);


    }

    @Test
    public void anyMatch() {
        DemoList demoList = new DemoList();
        List<Integer> integerList = demoList.buildList();
        System.out.println("integerList = " + integerList);
        boolean match = integerList.stream().anyMatch(item -> item.equals(1));
        System.out.println("match = " + match);
    }

    @Test
    public void groupingBy() {
        GetBeanList getBean = new GetBeanList();
        List<DeptDo> deptList = getBean.getDeptList(2);
        DeptDo do1=new DeptDo();
        do1.setDeptId(5);
        do1.setDeptLevel(5);
        DeptDo do2=new DeptDo();
        do2.setDeptId(4);
        do2.setDeptLevel(4);
        DeptDo do3=new DeptDo();
        do3.setDeptId(3);
        do3.setDeptLevel(3);
        deptList.add(do1);
        deptList.add(do2);
        deptList.add(do3);
        System.out.println("deptList = " + JSON.toJSONString(deptList));
        Map<Integer, List<DeptDo>> collect = deptList.stream().collect(Collectors.groupingBy(DeptDo::getDeptLevel));
        System.out.println("collect = [{}]" + JSON.toJSONString(collect));
        for (Map.Entry<Integer, List<DeptDo>> entry : collect.entrySet()) {
            System.out.println("entry.getValue().size() = " + entry.getValue().size());
            System.out.println("collect = " + collect.size());
        }

        Boolean b=false;
        b |=true;
        System.out.println("b = " + b);

    }

    @Test
    public void testArrAs(){
        List<Integer> checkOperatorSourceFlag = Arrays.asList(2,3);
        System.out.println("checkOperatorSourceFlag = " + checkOperatorSourceFlag);
    }

    @Test
    public void testFilter(){
        GetBeanList getBeanList=new GetBeanList();
        List<DeptDo> deptList = getBeanList.getDeptList(4);
        System.out.println("deptList = " + deptList);
        List<DeptDo> collect = deptList.stream().filter(deptDo -> deptDo.getDeptId() > 2).collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }

}
