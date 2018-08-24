package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

import java.math.BigDecimal;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:39 2018/8/24 0024
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
