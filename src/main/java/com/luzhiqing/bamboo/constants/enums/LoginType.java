package com.luzhiqing.bamboo.constants.enums;

import com.luzhiqing.bamboo.constants.BaseType;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:51
 */
public enum LoginType implements BaseType {
    /**
     * 密码登录
     */
    PASSWORD(1,"密码登录"),
    /**
     * 验证码登录
     */
    CODE(2,"验证码登录"),
    /**
     * 第三方登录
     */
    platform(3,"第三方登录");
    private int code;
    private String desc;
    LoginType(int code,String desc){
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
}
