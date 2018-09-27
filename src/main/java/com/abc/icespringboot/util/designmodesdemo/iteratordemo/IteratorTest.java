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
        aggregate.setItems("行李", 2);
        aggregate.setItems("老外", 3);
        aggregate.setItems("内部员工", 4);
        aggregate.setItems("小偷", 5);

        //正序
        //Iterator iterator = new ConcreteIterator(aggregate);
        //倒序
        Iterator iterator = new ConcreteIteratorDesc(aggregate);
        Object item = iterator.first();
        while (!iterator.isdone()) {
            System.out.printf("%s 请买票!", iterator.currentItem());
            System.out.println();
            iterator.next();
        }


    }
}
