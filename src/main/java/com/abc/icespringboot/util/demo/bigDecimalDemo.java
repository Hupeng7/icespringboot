package com.abc.icespringboot.util.demo;

import java.math.BigDecimal;

public class bigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal(0.01);

        char[] ch = {'4', '3', '6', '6'};
        System.out.println(ch);
        System.out.println("ch" + ch);
        BigDecimal price1 = new BigDecimal(ch, 0, 2);

        System.out.println("price is :" + price.toString());
        System.out.println("price is :" + price1);

        char[] charOne = new char[5];
        charOne[2] = '3';
        System.out.println(charOne);

        char[] charTwo = new char[5];
        charTwo[1] = '2';
        charTwo[3] = '4';
        System.out.println(charTwo);

        char[] charThree = new char[5];
        charThree[0] = '1';
        charThree[4] = '5';
        System.out.println(charThree);
    }
}
