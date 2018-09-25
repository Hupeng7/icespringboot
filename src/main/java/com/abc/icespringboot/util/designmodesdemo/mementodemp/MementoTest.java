package com.abc.icespringboot.util.designmodesdemo.mementodemp;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:43 2018/9/3 0003
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();


    }
}
