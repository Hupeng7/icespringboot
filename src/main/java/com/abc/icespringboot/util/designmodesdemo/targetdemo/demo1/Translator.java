package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:58 2018/8/31 0031
 */
public class Translator extends Player {
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
