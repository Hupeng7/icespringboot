package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:36 2018/9/3 0003
 */
@Data
public class ConcreteAggregate extends Aggregate {
    private List items = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count;

    public int getCount() {
        return items.size();
    }

    public Object getItems(int index) {
        return items.get(index);
    }

    public void setItems(Object value, int index) {
        items.add(index, value);
    }
}
