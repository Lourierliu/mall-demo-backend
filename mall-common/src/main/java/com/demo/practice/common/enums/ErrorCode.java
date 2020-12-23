package com.demo.practice.common.enums;

public enum ErrorCode {

    TEST("123", "test"),
    ;

    private String errCode;
    private String errMessage;

    ErrorCode(String errCode, String errMessage) {
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }
}
