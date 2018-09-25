package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:37 2018/8/29 0029
 */
public class EveningState extends State {
    private static final int LATER = 21;

    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < LATER) {
                System.out.println("当前时间: " + work.getHour() + " 加班，疲累");
            } else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
