package com.abc.icespringboot.util.designmodesdemo.mementodemp;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:37 2018/9/3 0003
 */
@Data
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("state=" + state);
    }

}
