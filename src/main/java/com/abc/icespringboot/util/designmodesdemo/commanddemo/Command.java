package com.abc.icespringboot.util.designmodesdemo.commanddemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:31 2018/9/26 0026
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void excute();


}
