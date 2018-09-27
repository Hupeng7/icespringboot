package com.abc.icespringboot.util.designmodesdemo.singletondemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:31 2018/9/25 0025
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
