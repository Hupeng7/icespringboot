package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:54 2018/8/29 0029
 */
public class ForenoonState extends State {
    private static final int NOON = 12;

    public void writeProgram(Work work) {
        if (work.getHour() < NOON) {
            System.out.println("当前时间: " + work.getHour() + " 上午工作，精神百倍！");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
