package com.abc.icespringboot.util.designmodesdemo.decoratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:29 2018/8/27 0027
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.println("白T恤");
        super.show();
    }
}
