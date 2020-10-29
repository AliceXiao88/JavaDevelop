package com.xiao.common.constant;

import lombok.Data;

public class ProductConstant {


    public enum  AttrEnum{
        ATTR_TYPE_BASE(1,"basic paras"),ATTR_TYPE_SALE(0,"sales paras");
        private int code;
        private String msg;

        AttrEnum(int code,String msg){
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
}
