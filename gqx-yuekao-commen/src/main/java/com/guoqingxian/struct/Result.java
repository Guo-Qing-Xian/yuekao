package com.guoqingxian.struct;

import java.io.Serializable;

public class Result implements Serializable {
    private int code;

    private String msg;

    public static Result ok(){
        return new Result(200,"OK");
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result() {
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
}
