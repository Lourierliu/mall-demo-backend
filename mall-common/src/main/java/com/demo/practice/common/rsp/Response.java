package com.demo.practice.common.rsp;


import com.demo.practice.common.enums.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;
    private String errCode;
    private String errMessage;
    private T data;

    public Response() {}

    public static <T> Response<T> of(T data) {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> buildSuccess() {
        Response<T> response = new Response<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> Response<T> buildFailure(String errCode, String errMessage) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> Response<T> buildFailure(ErrorCode errorCode) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrCode(errorCode.getErrCode());
        response.setErrMessage(errorCode.getErrMessage());
        return response;
    }

}
