package com.tzqTest.test.list;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tianziquan
 * @create: 2019-09-03 10:14
 */
@Data
public class DemoList {


    public List<Integer> buildList (){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        return list;
    }
}
