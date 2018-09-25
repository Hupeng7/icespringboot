package com.abc.icespringboot.util.designmodesdemo.iteratordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:43 2018/9/3 0003
 */
public class IteratorTest {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItems("大鸟", 0);
        aggregate.setItems("小菜", 1);
        aggregate.setItems("行李", 0);
        aggregate.setItems("老外", 0);
        aggregate.setItems("内部员工", 0);
        aggregate.setItems("小偷", 0);

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();
        while (!iterator.isdone()) {
            System.out.printf("%s 请买票!", iterator.currentItem());
            iterator.next();
        }


    }
}
