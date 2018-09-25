package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:34 2018/8/29 0029
 */
public class AfternoonState extends State {
    private static final int EVENING = 17;

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < EVENING) {
            System.out.println("当前时间: " + work.getHour() + " 下午状态不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }

    }
}
