package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:47 2018/9/27 0027
 */
public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyNew(String message) {
        System.out.println("同事3得到信息:" + message);
    }

}
