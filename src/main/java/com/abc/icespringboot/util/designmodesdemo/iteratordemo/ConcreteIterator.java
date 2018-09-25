package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:34 2018/9/3 0003
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean isdone() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
