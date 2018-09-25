package com.abc.icespringboot.util.designmodesdemo.decoratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:44 2018/8/27 0027
 */
public class Jacket extends Finery {
    @Override
    public void show() {
        System.out.println("夹克");
        super.show();
    }
}
