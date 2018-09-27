package com.abc.icespringboot.util.designmodesdemo.mediatordemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:41 2018/9/27 0027
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

}
