package com.tzqTest.test.BeanStringEm;

import com.tzqTest.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import javax.lang.model.SourceVersion;

/**
 * @author: tianziquan
 * @create: 2019-09-10 18:47
 */
public class TestStringUtil {
    public static void main(String[] args) {

        TestStringUtil test=new TestStringUtil();
        test.testIn(2);
    }

    public void  testIn(Integer in){
        if(in==1){
            System.out.println("in = " + in);
        }else{
            System.out.println("true = " + true);
        }
    }

    @Test
    public void testEmty() {
        User user = new User();
        user.setAge(13);
        user.setName("001");
//        if (StringUtils.isEmpty(user.getNo())) {
//            System.out.println("user = " + user);
//        }
        if(user.getNo()==null){
            System.out.println("user = " + user);
        }
    }

    @Test
    public void testInteger() {
        Integer integer = Integer.valueOf(1);


        if(integer.equals(1)){
            System.out.println("integer = " + integer);
        }
        System.out.println("true = " + true);
    }
    @Test
    public void testLongEq(){
        Long lo=Integer.valueOf(2).longValue();
        Long lo2=Integer.valueOf(2).longValue();
        if(lo.equals(lo2)){
            System.out.println("lo = " + lo);
        }
        System.out.println("true = " + true);
    }
}
