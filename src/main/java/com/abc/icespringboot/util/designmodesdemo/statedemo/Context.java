package com.abc.icespringboot.util.designmodesdemo.statedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:38 2018/8/29 0029
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态: " + state.getClass().getName());
    }

    public void requst() {
        state.handle(this);
    }

}
