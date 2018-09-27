package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:43 2018/9/27 0027
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
