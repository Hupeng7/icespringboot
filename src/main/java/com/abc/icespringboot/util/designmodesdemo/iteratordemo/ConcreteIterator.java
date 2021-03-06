package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:34 2018/9/3 0003
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems(0);
    }

    @Override
    public Object next() {
        Object result = null;
        current++;
        if (current < aggregate.getCount()) {
            result = aggregate.getItems(current);
        }
        return result;
    }

    @Override
    public boolean isdone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
