package com.abc.icespringboot.util.designmodesdemo.compositedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:18 2018/9/3 0003
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);


}
