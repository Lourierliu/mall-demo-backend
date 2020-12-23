package com.demo.practice.common.rsp;

import com.demo.practice.common.enums.ErrorCode;
import lombok.Data;

import java.util.Collection;

@Data
public class MultiResponse<T> {

    private static final long serialVersionUID = -1L;

    private long total;
    private boolean success;
    private String errCode;
    private String errMessage;
    private Collection<T> data;

    public static <T> MultiResponse<T> of(Collection<T> data, long total) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setData(data);
        response.setTotal(total);
        return response;
    }

    public static <T> MultiResponse<T> ofWithoutTotal(Collection<T> data) {
        return of(data, 0L);
    }

    public static <T> MultiResponse<T> buildSuccess() {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        return response;
    }

    public static <T> MultiResponse<T> buildFailure(String errCode, String errMessage) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> MultiResponse<T> buildFailure(ErrorCode code) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setErrCode(code.getErrCode());
        response.setErrMessage(code.getErrMessage());
        return response;
    }

}
