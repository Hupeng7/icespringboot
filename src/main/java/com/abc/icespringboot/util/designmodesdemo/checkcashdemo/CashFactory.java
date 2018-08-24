package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:50 2018/8/24 0024
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn(300, 100);
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate(0.8);
                cashSuper = cashRebate;
                break;
            case "满400返100后打9折":
                CashReturnAndRebate cashReturnAndRebate = new CashReturnAndRebate(400, 100, 0.9);
                cashSuper = cashReturnAndRebate;
                break;
            default:
                System.out.println("type error，please input correct type or connect administrator");
                cashSuper = new CashNormal();
                break;
        }
        return cashSuper;
    }

    ;
}
