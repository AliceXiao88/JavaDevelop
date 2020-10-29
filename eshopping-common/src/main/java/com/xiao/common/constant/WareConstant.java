package com.xiao.common.constant;

public class WareConstant {

    public enum  PurchaseStatusEnum{
        CREATED(0,"create"),ASSIGNED(1,"assigned"),
        RECEIVE(2,"received"),FINISH(3,"finished"),
        HASERROR(4,"has error");
        private int code;
        private String msg;

        PurchaseStatusEnum(int code,String msg){
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


    public enum  PurchaseDetailStatusEnum{
    	CREATED(0,"create"),ASSIGNED(1,"assigned"),
        RECEIVE(2,"received"),FINISH(3,"finished"),
        HASERROR(4,"has error");
        private int code;
        private String msg;

        PurchaseDetailStatusEnum(int code,String msg){
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
