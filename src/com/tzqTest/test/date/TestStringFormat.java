package com.tzqTest.test.date;

import com.tzqTest.bean.Employee;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tiantziquan
 * @create: 2019-07-04 11:23
 */
public class TestStringFormat {

    @Test
    public void testDate(){
        Employee employee=new Employee();
        Date da=new Date();
    }

    @Test
    public void testFormat(){
        String skuId = "123qq";
        String qrCodeUrl = "https://devuser-opengas.ecej.com/user/app/#ENTERPRISE_ID#/#COMPANY_ID#/shopDetail";
        String url = qrCodeUrl.replace("#ENTERPRISE_ID#", String.valueOf(123)).replace("#COMPANY_ID#", String.valueOf("000"))
                .concat("?workerId=").concat(String.valueOf(456)).concat("&skuId=").concat(skuId);
        System.out.println("url = " + url);
        String format = String.format("123456%s", "789");
        System.out.println("format = " + format);
    }

}
