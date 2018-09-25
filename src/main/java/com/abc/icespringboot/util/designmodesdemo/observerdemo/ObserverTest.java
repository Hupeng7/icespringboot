package com.abc.icespringboot.util.designmodesdemo.observerdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:46 2018/8/28 0028
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject, "X"));
        subject.attach(new ConcreteObserver(subject, "Y"));
        subject.attach(new ConcreteObserver(subject, "Z"));

        subject.setSubjectState("ABCd");
        subject.notifyObserver();


    }
}
