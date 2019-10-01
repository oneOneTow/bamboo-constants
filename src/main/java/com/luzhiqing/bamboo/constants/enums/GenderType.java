package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 18:12
 */
public enum GenderType implements BaseType {
    /**
     * 未知
     */
    UNKNOWN(0,"未知"),
    /**
     * 女
     */
    WOMEN(1,"女"),
    /**
     * 男
     */
    MAN(2,"男")
    ;
    private int code;
    private String desc;

    GenderType(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public static GenderType toType(int code) {
        GenderType [] values = GenderType.values();
        return values[code];
    }
}
