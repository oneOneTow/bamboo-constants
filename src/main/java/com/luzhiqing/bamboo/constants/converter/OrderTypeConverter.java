package com.luzhiqing.bamboo.constants.converter;

import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import org.jooq.impl.AbstractConverter;

import java.util.Objects;

public class OrderTypeConverter extends AbstractConverter<Integer, OrderType> {
    public OrderTypeConverter() {
        super(Integer.class,OrderType.class);
    }

    public OrderTypeConverter(Class<Integer> fromType, Class<OrderType> toType) {
        super(fromType, toType);
    }

    @Override
    public OrderType from(Integer integer) {
        if(null == integer){
            throw  new RuntimeException("枚举数据库为null");
        }
        return OrderType.toType(integer);
    }

    @Override
    public Integer to(OrderType orderType) {
        return Objects.isNull(orderType) ? 0 : orderType.getCode();
    }
}
