package com.medici.retrofit.model.api;

public class CodeModel {

    private int code;

    private String phone;

    private int error;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeModel{" +
                "code=" + code +
                ", phone='" + phone + '\'' +
                ", error=" + error +
                ", msg='" + msg + '\'' +
                '}';
    }
}