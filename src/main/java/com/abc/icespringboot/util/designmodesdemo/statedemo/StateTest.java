package com.abc.icespringboot.util.designmodesdemo.statedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:45 2018/8/29 0029
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateB());

        context.requst();
        context.requst();
        context.requst();
        context.requst();


    }
}
