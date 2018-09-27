package com.abc.icespringboot.util.designmodesdemo.commanddemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:36 2018/9/26 0026
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.excute();
    }

}
