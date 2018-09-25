package com.abc.icespringboot.util.designmodesdemo.statedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:38 2018/8/29 0029
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
