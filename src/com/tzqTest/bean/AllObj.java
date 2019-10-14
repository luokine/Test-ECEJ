package com.tzqTest.bean;

import java.util.List;

/**
 * @author: tiantziquan
 * @create: 2019-07-18 11:18
 */
public class AllObj {
    private String objName;
    List<Person> personList;

    @Override
    public String   toString() {
        return "AllObj{" +
                "objName='" + objName + '\'' +
                ", personList=" + personList +
                '}';
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }
}
