package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:33
 */
public enum RegisterType implements BaseType {
    /**
     * 手机
     */
    PHONE(1,"手机"),
    /**
     * 邮箱
     */
    EMILE(2,"邮箱")
    ;
    private int code;
    private String desc;

    RegisterType(int code, String desc){
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
}
