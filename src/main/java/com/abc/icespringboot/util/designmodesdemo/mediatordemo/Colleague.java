package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:44 2018/9/27 0027
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }


}
