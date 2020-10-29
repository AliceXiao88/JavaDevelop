package com.xiao.common.exception;


public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000,"unknown exception"),
    VAILD_EXCEPTION(10001,"the format of parameters is not valid");

    private int code;
    private String msg;
    BizCodeEnume(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
