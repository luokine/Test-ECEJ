package com.tzqTest.test.string;

import com.google.common.collect.Lists;
import com.tzqTest.bean.TestNotice;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author: tiantziquan
 * @create: 2019-09-05 13:52
 */
public class TestString {
    @Test
    public void testStringReplace() {
        String str = "1、葫芦娃\n" + "2、金刚狼\n" + "3、钢铁侠\n";
        String[] split1 = StringUtils.split(str, "\n");
        ArrayList<String> strings1 = Lists.newArrayList(split1);
        TestNotice testNotice2=new TestNotice();
        testNotice2.setNotice(strings1);
        System.out.println("testNotice2 = " + testNotice2);
        System.out.println("split1.length = " + split1.length);
        System.out.println(testNotice2.getNotice().get(1));
        String replace = str.replace("\r\n", "#$#$4%")
                .replace("\n\r", "#$#$4%")
                .replace("\n", "#$#$4%")
                .replace("\r", "#$#$4%");
        String[] split = StringUtils.split(replace, "#$#$4%");
        ArrayList<String> strings = Lists.newArrayList(split);
        TestNotice testNotice=new TestNotice();
        testNotice.setNotice(strings);
        System.out.println("testNotice = " + testNotice);


    }
}
