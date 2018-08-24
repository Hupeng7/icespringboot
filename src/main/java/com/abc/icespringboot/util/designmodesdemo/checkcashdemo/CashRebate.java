package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

import java.math.BigDecimal;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:40 2018/8/24 0024
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
