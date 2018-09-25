package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:58 2018/8/29 0029
 */
public class NoonState extends State {
    private static final int AFTERNOON = 13;

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < AFTERNOON) {
            System.out.println("当前时间: " + work.getHour() + " 饿了，午饭；犯困，午休");
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
