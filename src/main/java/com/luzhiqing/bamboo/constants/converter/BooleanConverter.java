package com.luzhiqing.bamboo.constants.converter;

import org.jooq.impl.AbstractConverter;

import java.util.Objects;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 20:19
 */
public class BooleanConverter extends AbstractConverter<Byte, Boolean> {
    public BooleanConverter(){
        super(Byte.class,Boolean.class);
    }
    public BooleanConverter(Class<Byte> fromType, Class<Boolean> toType) {
        super(fromType, toType);
    }

    @Override
    public Boolean from(Byte aByte) {
        return (aByte == 0x00) ? false : true;
    }

    @Override
    public Byte to(Boolean aBoolean) {
        return (byte)(aBoolean ? 0x01 : 0x00);
    }
}
