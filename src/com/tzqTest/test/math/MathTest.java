package com.tzqTest.test.math;

import com.tzqTest.bean.User;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: tianziquan
 * @create: 2019-11-11 16:17
 */
public class MathTest {


    @Test
    public void testMath() {
        int currentPage = 1;
        int showCount = 10;
        currentPage = currentPage / showCount;
        System.out.println("currentPage = " + currentPage);
        currentPage += 1;
        System.out.println("currentPage2 = " + currentPage);
    }

    @Test
    public void testBigDecimal() {
        BigDecimal zero = BigDecimal.ZERO;
        if (zero.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("zero <=0 : " + zero);
        } else {
            System.out.println("zero >0 : " + zero);
        }

    }

    @Test
    public void testBigDecimalAdd() {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal subtract = zero.subtract(one);
        System.out.println("subtract = " + subtract);
        if (subtract.compareTo(zero) <= 0) {
            zero = zero.add(BigDecimal.valueOf(123.44));
        }
        System.out.println("zero = " + zero);
    }

    @Test
    public void testNullBean() {
        User user = new User();
        if (null == user) {
            System.out.println("user null = " + user);
        } else {
            System.out.println("user true= " + user);
        }

    }
}
