package com.abc.icespringboot.util.designmodesdemo.builderdemo;

/**
 * @author hp
 * @version 1.0
 * @description: 为了创建一个Product对象的各个部件指定的抽象接口
 * @date: 18:25 2018/8/27 0027
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product getResult();

}
