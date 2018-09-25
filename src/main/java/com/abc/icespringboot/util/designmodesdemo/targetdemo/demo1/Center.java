package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:12 2018/8/31 0031
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("中锋: %s 进攻", name);
        System.out.println();
    }

    @Override
    public void defense() {
        System.out.printf("中锋：%s 防守" , name);
        System.out.println();
    }
}
