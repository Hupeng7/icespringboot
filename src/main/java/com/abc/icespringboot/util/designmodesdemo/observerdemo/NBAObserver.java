package com.abc.icespringboot.util.designmodesdemo.observerdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:37 2018/8/28 0028
 */
public class NBAObserver {
    private String name;

    private ConcreteSubject subject;

    public NBAObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void closeB() {
        System.out.println(subject.getSubjectState() + name + "关闭B事情，做其他的事情");
    }


}
