package com.abc.icespringboot.util.designmodesdemo.observerdemo;


import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:29 2018/8/28 0028
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
