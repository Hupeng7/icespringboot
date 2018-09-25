package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:51 2018/8/29 0029
 */
@Data
public class Work {
    private State state;

    public Work() {
        state = new ForenoonState();
    }

    private double hour;

    private boolean finish =false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

}
