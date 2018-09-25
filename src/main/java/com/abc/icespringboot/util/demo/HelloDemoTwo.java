package com.abc.icespringboot.util.demo;

import lombok.val;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 19:03 2018/8/13 0013
 */
public class HelloDemoTwo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = c + 1;
        int e = d + 2;

        int a1 = 2;
        int a2 = 2;
        int i = a1 + a2;
        System.out.println(a1 + a2);

        int i1 = a1 + a2;


        int count = 0;
        int sum;
        for (int j = 0; j < 10; j++) {
            sum = count++;
            System.out.println(sum);
        }
    }
}
