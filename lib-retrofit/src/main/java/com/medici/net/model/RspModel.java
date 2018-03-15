package com.medici.net.model;

import java.util.Date;

/**
 * @author mrmedici
 * @desc 接收服务器返回
 */
public class RspModel<T> {

    public static final int SUCCEED = 200;

    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_SERVICE = 5001;

    private int code;
    private String msg;
    private Date time;
    private T data;

    public boolean success() {
        return code == SUCCEED;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}