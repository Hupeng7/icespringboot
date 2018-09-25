package com.abc.icespringboot.util.designmodesdemo.decoratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:26 2018/8/27 0027
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
