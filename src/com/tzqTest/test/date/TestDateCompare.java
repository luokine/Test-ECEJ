package com.tzqTest.test.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tiantziquan
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

}
