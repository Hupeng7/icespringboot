package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:46 2018/9/27 0027
 */
@Data
public class ConcreteMediator extends Mediator {
    private ConcreteColleague3 concreteColleague3;

    private ConcreteColleague4 concreteColleague4;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague3) {
            concreteColleague4.notifyNew(message);
        } else {
            concreteColleague3.notifyNew(message);
        }
    }
}
