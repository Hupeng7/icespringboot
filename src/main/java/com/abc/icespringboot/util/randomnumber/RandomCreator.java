package com.abc.icespringboot.util.randomnumber;

import java.util.Random;

/**
 * @author hp
 * @time 2018/10/17.
 */
public class RandomCreator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int flag = new Random().nextInt(999999);
            if (flag < 100000) {
                flag += 100000;
            }
            int  a = (int) (Math.random() * 900000) + 100000;
            System.out.println("a: " + flag);
            System.out.println("b: " + a );
            System.out.println("----------");
        }
    }
}
