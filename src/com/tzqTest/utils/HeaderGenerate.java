package com.tzqTest.utils;

import com.google.gson.Gson;
import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
/**
 * @author: tiantziquan
 * @create: 2019-07-23 15:27
 */
public class HeaderGenerate {
    public static void main(String[] args) {

        OpengasUserInfo authUser = new OpengasUserInfo();
        authUser.setUserId(964270489603l);
        authUser.setAppId("app-sdu213fd");
        authUser.setCompanyName("sddsss");
        authUser.setUsername("tian");
        authUser.setEnterpriseId(975070822400l);
        authUser.setCompanyId(964270489601l);

        OpengasUserInfo authUser2 =new OpengasUserInfo();
        Long id=1048936710145l;
        Long enterpriseId=1048890572800l;
        Long companyId=1048936710144l;
        authUser2.setUserId(id);
        authUser2.setAppId("app-sdu213fd");
        authUser2.setCompanyName("一城一家公司");
        authUser2.setUsername("tian");
        authUser2.setEnterpriseId(enterpriseId);
        authUser2.setCompanyId(companyId);
        String header1 = Base64.getEncoder().encodeToString(new Gson().toJson(authUser).getBytes(StandardCharsets.UTF_8));
        System.out.println("header1 = " + header1);
        String header2 = Base64.getEncoder().encodeToString(new Gson().toJson(authUser2).getBytes(StandardCharsets.UTF_8));
        System.out.println("header2 = " + header2);
    }

    /**
     * The type OpengasUserInfo.
     */

    public static class OpengasUserInfo {
        /**
         * The User id.
         */
        private Long userId;

        /**
         * The Username.
         */
        private String username;
        /**
         * The Mobile no.
         */
        private String mobileNo;
        /**
         * The Password.
         */
        private String password;
        /**
         * The City code.
         */
        private Integer cityCode;
        /**
         * The Wx open id.
         */
        private String wxOpenId;
        /**
         * The Enterprise id.
         */
        private Long enterpriseId;

        /**
         * 公司id
         */
        private Long companyId;

        /**
         * 公司名称
         */
        private String companyName;

        /**
         * 微信小程序appId
         */
        private String appId;

        /**
         * 商户号
         */
        private Map<String, String> merCodes = new HashMap<>();


        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getCityCode() {
            return cityCode;
        }

        public void setCityCode(Integer cityCode) {
            this.cityCode = cityCode;
        }

        public String getWxOpenId() {
            return wxOpenId;
        }

        public void setWxOpenId(String wxOpenId) {
            this.wxOpenId = wxOpenId;
        }

        public Long getEnterpriseId() {
            return enterpriseId;
        }

        public void setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
        }

        public Long getCompanyId() {
            return companyId;
        }

        public void setCompanyId(Long companyId) {
            this.companyId = companyId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public Map<String, String> getMerCodes() {
            return merCodes;
        }

        public void setMerCodes(Map<String, String> merCodes) {
            this.merCodes = merCodes;
        }
    }


}
