package com.abc.icespringboot.util.designmodesdemo.mediatordemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:42 2018/9/27 0027
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息: " + message);
    }

}
