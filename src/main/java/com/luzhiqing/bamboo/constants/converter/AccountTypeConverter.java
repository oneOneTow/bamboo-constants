package com.luzhiqing.bamboo.constants.converter;

import com.luzhiqing.bamboo.constants.enums.AccountType;
import org.jooq.impl.AbstractConverter;

import java.util.Objects;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 19:04
 */
public class AccountTypeConverter extends AbstractConverter<Integer, AccountType> {
    public AccountTypeConverter(){
        super(Integer.class,AccountType.class);
    }
    public AccountTypeConverter(Class<Integer> fromType, Class<AccountType> toType) {
        super(fromType, toType);
    }

    @Override
    public AccountType from(Integer code) {
        if(null == code){
            throw  new RuntimeException("枚举数据库为null");
        }
        return AccountType.toType(code);
    }

    @Override
    public Integer to(AccountType accountType) {
        return Objects.isNull(accountType) ? 0 : accountType.getCode();
    }
}
