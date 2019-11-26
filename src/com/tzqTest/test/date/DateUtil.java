package com.tzqTest.test.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: tianziquan
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

    @Test
    public void dateFormat() {
        String date = "2019-10-27 14:15:16";
        Date date2 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = new Date();
        try {
            parse = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String format1 = format.format(date2);
        System.out.println("format1 = " + format1);

        String format2 = format.format(parse);
        System.out.println("format2 = " + format2);


    }

    @Test
    public void dateAddDate() {
        String date = "2019-10-27 14:15:16";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = new Date();
        try {
            parse = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(parse);
        cal.add(Calendar.DATE, 2);
        cal.getTime();
        Date time = cal.getTime();
        System.out.println("time = " + time);
    }

    public static Map<String, Date> getStartEndTime(String type) {
        Date startTime = new Date();
        Date endTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String subStartDate = sdf.format(startTime);
        String subStartString;
        String startTimeStr = null;
        String endTimeStr = null;
        if (type.equals("year")) {
            subStartString = subStartDate.substring(0, 4);
            startTimeStr = subStartString + "-01-01 00:00:00";
            endTimeStr = subStartString + "-12-31 23:59:59";
        } else if (type.equals("month")) {
            subStartString = subStartDate.substring(0, 8);
            startTimeStr = subStartString + "01 00:00:00";
            //设置时间格式
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //获得实体类
            Calendar ca = Calendar.getInstance();
            //设置最后一天
            ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            //最后一天格式化
            String lastDay = format.format(ca.getTime());
            endTimeStr = lastDay + " 23:59:59";
        } else if (type.equals("day")) {
            startTimeStr = subStartDate + " 00:00:00";
            endTimeStr = subStartDate + " 23:59:59";
        }
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            startTime = format.parse(startTimeStr);
            endTime = format.parse(endTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Map<String, Date> map = new HashMap<>();
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        System.out.println("startTimeStr = " + startTimeStr);
        System.out.println("endTimeStr = " + endTimeStr);
        return map;
    }

    @Test
    public void currentMonthDay(){
        Calendar cale=Calendar.getInstance();
        // 获取当月第一天和最后一天
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday, lastday;
        // 获取前月的第一天
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        firstday = format.format(cale.getTime());
        // 获取前月的最后一天
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        lastday = format.format(cale.getTime());
        System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);

        //设置时间格式
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        //获得实体类
        Calendar ca = Calendar.getInstance();
        //设置最后一天
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        //最后一天格式化
        String lastDay2 = format2.format(ca.getTime());
        System.out.println("lastDay2 = " + lastDay2);
    }
}
