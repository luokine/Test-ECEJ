package com.tzqTest.test.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * @author: tianziquan
 * @create: 2019-08-08 16:41
 */
public class TestDateCompare {


    @Test
    public void checkDate() {
        String dateStr = "2039-09-06 00:00";
        //2198851200000
        String dateStr2 = "2037-12-31 23:59:59";
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("sim = " + sim);
        try {
            Date parse = sim.parse(dateStr);
            Date parse1 = sim.parse(dateStr2);
            System.out.println("parse = " + parse);
            long time = parse.getTime();
            long time1 = parse1.getTime();
            if (time < time1) {
                System.out.println("time1 = " + time1);
            } else {
                System.out.println("time = " + time);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void dateCompare() {
        Date date1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format1 = format.format(date1);
        System.out.println("format1 = " + format1);
        System.out.println("date1 = " + date1);
        System.out.println("date1 = " + date1.getTime());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("date2.getTime() = " + date2.getTime());
        System.out.println(date2.getTime() > date1.getTime());
    }

    @Test
    public void mathDateDay() {
        String startDay = "2019-03-09";
        String endDay = "2019-11-19";
        Date date = DateUtils.parseToDate(startDay);
        Date date1 = DateUtils.parseToDate(endDay);
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);
        int r = (int) ((date1.getTime() - date.getTime()) / (60 * 60 * 24 * 1000));
        int day = (int) ((date1.getTime() - date.getTime()) / (3600 * 1000 * 24));
        System.out.println(startDay + " 和 " + endDay + "相隔的时间为：" + r + "天");
        System.out.println(startDay + " 和 " + endDay + "相隔的时间为：" + day + "天");
    }

    @Test
    public void mathDifferentDay() {
        String startDay = "2019-03-09";
        String endDay = "2019-11-18";
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = format1.parse(startDay);
            Date date2 = format2.parse(endDay);
            System.out.println("date1 = " + date1);
            System.out.println("date2 = " + date2);
            System.out.println(startDay + " 和 " + endDay + "相隔的时间为：" + differentDays(date1, date2) + "天");
            System.out.println(differentDayMillisecond(date1, date2));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static int differentDays(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);

        int day1 = calendar1.get(Calendar.DAY_OF_YEAR);
//        System.out.println(day1);
        int day2 = calendar2.get(Calendar.DAY_OF_YEAR);
//        System.out.println(day2);
        int year1 = calendar1.get(Calendar.YEAR);
        int year2 = calendar2.get(Calendar.YEAR);

        if (year1 != year2)  //不同年
        {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) { //闰年
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    timeDistance += 366;
                } else { // 不是闰年
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2 - day1);
        } else {// 同年
            return day2 - day1;
        }

    }

    public static int differentDayMillisecond(Date date1, Date date2) {


        int day = (int) ((date2.getTime() - date1.getTime()) / (3600 * 1000 * 24));
        return day;
    }

    @Test
    public void subYear() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(nowDate);
        String type = "month";
        String substring;
        String startTime = null;
        String endTime = null;
        if (type.equals("year")) {
            substring = strDate.substring(0, 4);
            startTime = substring + "-01-01 00:00:00";
            endTime = substring + "-12-31 23:59:59";
        } else if (type.equals("month")) {
            substring = strDate.substring(0, 8);
            startTime = substring + "01 00:00:00";
            endTime = substring + "31 23:59:59";
        } else if (type.equals("day")) {
            startTime = strDate + " 00:00:00";
            endTime = strDate + " 23:59:59";
        }
        Date date = DateUtils.parseToDate(startTime, "yyyy-MM-dd HH:mm:ss");
        Date date2 = DateUtils.parseToDate(endTime, "yyyy-MM-dd HH:mm:ss");
        System.out.println("string - startTime = " + startTime);
        System.out.println("string - endTime = " + endTime);
        System.out.println("date = " + date);
        System.out.println("date2 = " + date2);


    }

    @Test
    public void testSubMonth()  {
        Map<String, Date> month = DateUtil.getStartEndTime("month");
        System.out.println("month = " + month);
    }
}
