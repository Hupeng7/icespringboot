package com.abc.icespringboot.util.designmodesdemo.commanddemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:42 2018/9/26 0026
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();


    }
}
