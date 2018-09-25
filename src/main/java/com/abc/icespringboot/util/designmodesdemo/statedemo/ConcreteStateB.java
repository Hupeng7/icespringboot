package com.abc.icespringboot.util.designmodesdemo.statedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:44 2018/8/29 0029
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
