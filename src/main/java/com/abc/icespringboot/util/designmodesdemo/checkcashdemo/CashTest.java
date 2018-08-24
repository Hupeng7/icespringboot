package com.abc.icespringboot.util.designmodesdemo.checkcashdemo;

import java.util.Scanner;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:57 2018/8/24 0024
 */
public class CashTest {
    public static void main(String[] args) {
        while (true) {
            double total = 0.0d;
            System.out.println("请输入打折类型：支持类型为 正常收费/满300返100/打8折/满400返100后打9折,退出请输入 exit ");
            Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();
            String exit = "exit";
            if (exit.equals(type)) {
                return;
            }

            CashSuper cashSuper = CashFactory.createCashAccept(type);
            double totalPrices = 0d;
            double acceptCash = 800d;
            totalPrices = cashSuper.acceptCash(acceptCash);
            total += totalPrices;
            System.out.println("收款" + acceptCash + " 类型:" + type + " 实际收款: " + total);
        }
    }
}
