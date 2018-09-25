package com.abc.icespringboot.util.designmodesdemo.observerdemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:42 2018/8/28 0028
 */
@Data
public class ConcreteObserver extends Observer {
    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者 " + name + "的新状态是 " + observerState);
    }



}
