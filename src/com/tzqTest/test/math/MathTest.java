package com.tzqTest.test.math;

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

}
