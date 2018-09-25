package com.abc.icespringboot.util.designmodesdemo.decoratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:23 2018/8/27 0027
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }


}
