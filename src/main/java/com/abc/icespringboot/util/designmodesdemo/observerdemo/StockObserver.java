package com.abc.icespringboot.util.designmodesdemo.observerdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:32 2018/8/28 0028
 */
public class StockObserver {
    private String name;

    private ConcreteSubject subject;

    public StockObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeA() {
        System.out.println(subject.getSubjectState() + name + "结束A事情，做其他的事");
    }


}
