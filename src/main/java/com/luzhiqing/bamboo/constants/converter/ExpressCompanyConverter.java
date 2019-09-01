package com.luzhiqing.bamboo.constants.converter;

import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import org.jooq.impl.AbstractConverter;

import java.util.Objects;

public class ExpressCompanyConverter extends AbstractConverter<Integer, ExpressCompanyType> {
    public ExpressCompanyConverter() {
        super(Integer.class, ExpressCompanyType.class);
    }

    public ExpressCompanyConverter(Class<Integer> fromType, Class<ExpressCompanyType> toType) {
        super(fromType, toType);
    }

    @Override
    public ExpressCompanyType from(Integer integer) {
        if(null == integer){
            throw  new RuntimeException("枚举数据库为null");
        }
        return ExpressCompanyType.toType(integer);
    }

    @Override
    public Integer to(ExpressCompanyType expressCompanyType) {
        return Objects.isNull(expressCompanyType) ? 0 : expressCompanyType.getCode();
    }
}
