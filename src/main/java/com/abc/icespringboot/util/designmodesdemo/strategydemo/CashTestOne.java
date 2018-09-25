package com.abc.icespringboot.util.designmodesdemo.strategydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:17 2018/8/24 0024
 */
public class CashTestOne {
    public static void main(String[] args) {
        double total = 0.0d;

        String type = "打8折";
        CashContext cashContext = new CashContext(type);
//        switch (type) {
//            case "正常收费":
//                cashContext = new CashContext(new CashNormal());
//                break;
//            case "满300返100":
//                cashContext = new CashContext(new CashReturn(300, 100));
//                break;
//            case "打8折":
//                cashContext = new CashContext(new CashRebate(0.8));
//                break;
//            default:
//                System.out.println("type error");
//                break;
//        }

        double totalPrices = 0d;
        double acceptPrices = 600d;
        totalPrices = cashContext.getResult(acceptPrices);
        total += totalPrices;

        System.out.println(acceptPrices + " " + type + " total: " + total);

    }
}
