package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 9:48 2018/8/31 0031
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}
