package com.abc.icespringboot.util.designmodesdemo.mediatordemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:45 2018/9/27 0027
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }


}
