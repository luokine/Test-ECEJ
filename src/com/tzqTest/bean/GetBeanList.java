package com.tzqTest.bean;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author: tiantziquan
 * @create: 2019-09-26 14:40
 */
public class GetBeanList {

    public List<DeptDo> getDeptList(int num) {
        List<DeptDo> deptList = Lists.newArrayList();
        for (int i = 1; i <= num; i++) {
            DeptDo deptDo = new DeptDo();
            deptDo.setDeptId(i);
            deptDo.setDeptName("dept" + i);
            deptDo.setDeptLevel(i-1);
            deptDo.setPatentId(i-1);
            deptList.add(deptDo);
        }
        return deptList;
    }
    public List<User> getUserList(int num) {

        List<User> userList = Lists.newArrayList();
        for (int i = 1; i <= num; i++) {
            User user = new User();
            user.setAge(i);
            user.setName(Integer.valueOf(i).toString());
            user.setNo(i);
            userList.add(user);
        }
        return userList;
    }
}
