package com.tzqTest.test.date;

import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author: tiantziquan
 * @create: 2019-09-29 16:11
 */
public class DateUtil {
    public static void main(String[] args) {

    }

    /**
     * 根据日期获得当前月的开始日期
     *
     * @param month 日期
     *              注：月份从0开始  1为 二月
     * @return 所属月份的开始日期(java.util.Date)
     */
    public static java.util.Date getMonthBegin(java.util.Date month) {
        GregorianCalendar ca = new GregorianCalendar();
        ca.setTime(month);
        int year = ca.get(GregorianCalendar.YEAR);
        System.out.println("year = " + year);
        int mon = ca.get(GregorianCalendar.MONTH);
        System.out.println("mon = " + mon);
        GregorianCalendar gCal = new GregorianCalendar(year, mon, 1);
        return gCal.getTime();
    }

    /**
     * 获取同一天内两时间秒差
     *
     * @param startTime
     * @param endTime
     * @return
     */

    public static long getDifferentSecond(Date startTime, Date endTime) {
        try {
            long second = (endTime.getTime() - startTime.getTime()) / 1000;
            return second;
        } catch (Exception e) {
            throw new IllegalArgumentException("输入的日期时间字符串异常：endTime='" + startTime + ",endTime=" + endTime);
        }
    }

    @Test
    public void getMonth() throws InterruptedException {
        Date date = new Date();
        System.out.println("date = " + date);
        Date monthBegin = getMonthBegin(date);
        System.out.println("monthBegin = " + monthBegin);
            Thread.sleep(3000);
            Date date2 = new Date();
            long second = getDifferentSecond(date, date2);
            System.out.println("second = " + second);

    }
}
