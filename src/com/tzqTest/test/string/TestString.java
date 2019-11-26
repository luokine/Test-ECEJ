package com.tzqTest.test.string;

import com.google.common.collect.Lists;
import com.tzqTest.bean.DeptDo;
import com.tzqTest.bean.TestNotice;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author: tianziquan
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

    @Test
    public void testBig(){
        BigDecimal mach=new BigDecimal("1000.88");
        BigDecimal mach2=new BigDecimal("100");
        double i=1000.99;
        String s = String.format("%.2f", (double) i / 100);
        System.out.println("s = " + s);
        double fd=new Double(s);
        System.out.println("fd = " + fd);
        BigDecimal divide = mach.divide(mach2, 2, BigDecimal.ROUND_UNNECESSARY);
        System.out.println("divide = " + divide);
    }
    @Test
    public void testCOm(){
        Integer i=3;
        boolean b=true;
        b=i.equals(2)?true:false;
        System.out.println("b = " + b);
    }

    @Test
    public void createBeanTest(){
        DeptDo deptDo=new DeptDo();
        deptDo.setDeptId(1);
        deptDo.setDeptName("taste life");
        System.out.println("deptDo = " + deptDo);
    }

}
