package com.tzqTest.bean;

import lombok.Data;

import java.util.List;

/**
 * @author: tianziquan
 * @create: 2019-09-06 11:15
 */
public class TestNotice {
    private List<String> notice;

    public List<String> getNotice() {
        return notice;
    }

    public void setNotice(List<String> notice) {
        this.notice = notice;
    }
}
