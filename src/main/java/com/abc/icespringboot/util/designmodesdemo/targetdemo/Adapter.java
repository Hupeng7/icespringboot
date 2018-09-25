package com.abc.icespringboot.util.designmodesdemo.targetdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:54 2018/8/30 0030
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
