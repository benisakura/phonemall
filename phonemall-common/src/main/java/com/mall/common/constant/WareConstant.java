package com.mall.common.constant;

public class WareConstant {
    public enum PurchaseStatusEnum{
        CREATE(0,"新建"),RECEIVE(2,"已领取"),
        ASSIGNED(1,"已分配"),FINISH(3,"已完成"),
        HASERROR(4,"有异常");
        private int code;
        private String msg;

        PurchaseStatusEnum(int code,String msg){
            this.code=code;
            this.msg=msg;
        }

        public String getMsg() {
            return msg;
        }

        public int getCode() {
            return code;
        }
    }
    public enum PurchaseStatusDetailEnum{
        CREATE(0,"新建"),BUYING(2,"正在采购"),
        ASSIGNED(1,"已分配"),FINISH(3,"已完成"),
        HASERROR(4,"采购失败");
        private int code;
        private String msg;

        PurchaseStatusDetailEnum(int code,String msg){
            this.code=code;
            this.msg=msg;
        }

        public String getMsg() {
            return msg;
        }

        public int getCode() {
            return code;
        }
    }
}
