package com.tzqTest.bean;

import lombok.Data;

/**
 * @author: tianziquan
 * @create: 2019-10-18 15:50
 */
@Data
public class AlipaySchoolSettleinfoDto {
    /**
     * 支付宝结算单据号
     */
    private String settleId;

    /**
     * 净结算金额
     */
    private String settleAmount;

    /**
     * 币种
     */
    private String settleCurrency;

    /**
     * 本次结算对应的结算周期的起始时间
     */
    private String settlePeriodBeginTime;

    /**
     * 本次结算对应的结算周期的终止时间
     */
    private String settlePeriodEndTime;

    /**
     * 结算状态
     */
    private String status;

    /**
     * 结算成功时间
     */
    private String settleTime;

    /**
     * 结算失败(退票)的原因码(结算失败或退票消息为必选字段)
     */
    private String failCode;

    /**
     * 结算失败(退票)的原因描述(结算失败或退票为必选)
     */
    private String failDesc;

    /**
     * 退票时间
     */
    private String dishonouredTime;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 账户(脱敏)
     */
    private String bankAccountNo;

    /**
     * 账户名
     */
    private String bankAccountName;

    /**
     *  支付宝商户Pid
     * 表pay_alipay_school的school_pid
     * @return
     */
    private String partnerId;

    /**
     * 学校名称
     * @return
     */
    private  String schoolName;

}
