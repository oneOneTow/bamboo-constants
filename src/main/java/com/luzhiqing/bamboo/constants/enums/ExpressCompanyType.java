package com.luzhiqing.bamboo.constants.enums;


import com.luzhiqing.bamboo.constants.BaseType;

public enum ExpressCompanyType implements BaseType {
    /**
     * 顺丰
     */
    SHUN_FENG(1,"SHUN_FENG"),
    /**
     * 京东
     */
    JD(2,"JD"),
    /**
     * 圆通
     */
    YUAN_TONG(3,"YUAN_TONG"),
    /**
     * 申通
     */
    SHEN_TONG(4,"SHEN_TONG"),
    /**
     * 韵达
     */
    YUN_DA(5,"YUN_DA"),
    /**
     * 百世
     */
    BAI_SHI(6,"BAI_SHI"),
    /**
     * 天天
     */
    TIAN_TIAN(7,"TIAN_TIAN"),
    /**
     * 德邦
     */
    DE_BANG(8,"DE_BANG"),
    /**
     * 邮政
     */
    EMS(9,"EMS"),
    /**
     * 未知
     */
    UNKNOWN(0,"UNKNOWN")
    ;

    private int code;
    private String desc;

    ExpressCompanyType(int code, String desc) {
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
