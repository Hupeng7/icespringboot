package com.abc.icespringboot.util.designmodesdemo.strategydemo;

import com.abc.icespringboot.util.designmodesdemo.checkcashdemo.CashNormal;
import com.abc.icespringboot.util.designmodesdemo.checkcashdemo.CashRebate;
import com.abc.icespringboot.util.designmodesdemo.checkcashdemo.CashReturn;
import com.abc.icespringboot.util.designmodesdemo.checkcashdemo.CashSuper;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:15 2018/8/24 0024
 */
public class CashContext {
    private CashSuper cashSuper = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn(300, 100);
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate(0.8);
                cashSuper = cashRebate;
                break;
            default:
                throw new RuntimeException("type error");
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}