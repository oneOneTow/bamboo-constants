package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

public enum OrderType implements BaseType {
    /**
     * 普通订单
     */
    COMMON_ORDER(1,"COMMON_ORDER"),
    /**
     * 未知
     */
    UNKNOWN(0,"UNKNOWN"),
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
}
