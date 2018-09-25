package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:14 2018/8/31 0031
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("后卫: %s 进攻", name);
        System.out.println();
    }

    @Override
    public void defense() {
        System.out.printf("后卫：%s 防守", name);
        System.out.println();
    }
}
