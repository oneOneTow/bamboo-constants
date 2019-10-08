package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 22:15
 */
public enum PlatformType implements BaseType {
    /**
     * 未知
     */
    UNKNOWN(0,"未知"),
    /**
     * 微信
     */
    WE_CHAT(1,"微信"),
    /**
     * qq
     */
    QQ(2,"QQ")
    ;
    private Integer code;
    private String desc;

    PlatformType(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getDesc() {
        return null;
    }

    public static PlatformType toType(int code) {
        PlatformType [] values = PlatformType.values();
        return values[code];
    }
}
