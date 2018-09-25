package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:30 2018/9/3 0003
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isdone();

    public abstract Object currentItem();

}
