package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

import java.math.BigDecimal;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:38 2018/8/24 0024
 */
public abstract class CashSuper {
    /**
     * 收取的现金数
     *
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
