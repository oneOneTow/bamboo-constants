package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

public enum OrderType implements BaseType {
    /**
     * 未知
     */
    UNKNOWN(0,"未知"),
    /**
     * 普通订单
     */
    COMMON_ORDER(1,"未知"),
    ;

    private int code;
    private String desc;

    OrderType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }


    public static OrderType toType(int code) {
        OrderType [] values = OrderType.values();
        return values[code];
    }
}
