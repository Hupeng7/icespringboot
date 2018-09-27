package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:48 2018/9/27 0027
 */
public class ConcreteColleague4 extends Colleague {
    public ConcreteColleague4(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyNew(String message) {
        System.out.println("同事4得到信息:" + message);
    }

}
