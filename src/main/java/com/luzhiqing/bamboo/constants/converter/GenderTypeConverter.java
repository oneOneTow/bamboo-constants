package com.luzhiqing.bamboo.constants.converter;

import com.luzhiqing.bamboo.constants.enums.GenderType;
import org.jooq.impl.AbstractConverter;

import java.util.Objects;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 18:19
 */
public class GenderTypeConverter extends AbstractConverter<Integer, GenderType> {

    public GenderTypeConverter() {
        super(Integer.class, GenderType.class);
    }

    public GenderTypeConverter(Class<Integer> fromType, Class<GenderType> toType) {
        super(fromType, toType);
    }

    @Override
    public GenderType from(Integer code) {
        if(null == code){
            throw  new RuntimeException("枚举数据库为null");
        }
        return GenderType.toType(code);
    }

    @Override
    public Integer to(GenderType genderType) {
        return Objects.isNull(genderType) ? 0 : genderType.getCode();
    }
}
