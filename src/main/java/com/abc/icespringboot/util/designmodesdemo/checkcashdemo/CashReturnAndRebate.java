package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:45 2018/8/24 0024
 */
public class CashReturnAndRebate extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    private double moneyRebate = 1d;

    public CashReturnAndRebate(double moneyCondition, double moneyReturn, double moneyRebate) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = (money - Math.floor(money / moneyCondition) * moneyReturn) * moneyRebate;
        }
        return result;
    }

}
