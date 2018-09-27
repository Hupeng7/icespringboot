package com.abc.icespringboot.util.designmodesdemo.singletondemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:33 2018/9/25 0025
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        if (singleton1 == singleton2) {
            System.out.println("two object is same instance");
        }
    }
}
