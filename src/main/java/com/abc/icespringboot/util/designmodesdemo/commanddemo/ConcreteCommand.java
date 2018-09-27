package com.abc.icespringboot.util.designmodesdemo.commanddemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:35 2018/9/26 0026
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
