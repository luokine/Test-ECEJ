package com.tzqTest.bean;

import lombok.Data;

@Data
public class PayAlipaySchool {
    private String schoolPid;

    private String schoolCode;


    private String schoolName;

    private String schoolStdcode;

    private String schoolType;

    private String provinceCode;

    private String provinceName;

    private String cityCode;
    private String cityName;
    private String districtCode;
    private String districtName;
    /** 支付宝结算金额 */
    private  String totalFee;

}
