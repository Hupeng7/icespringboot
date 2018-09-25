package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 9:50 2018/8/31 0031
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋: %s 进攻", name);
        System.out.println();
    }

    @Override
    public void defense() {
        System.out.printf("前锋: %s 防守", name);
        System.out.println();
    }
}
