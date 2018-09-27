package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:10 2018/9/25 0025
 */
public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.getCount() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getItems(aggregate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object result = null;
        current--;
        if (current >= 0) {
            result = aggregate.getItems(current);
        }
        return result;
    }

    @Override
    public boolean isdone() {
        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
