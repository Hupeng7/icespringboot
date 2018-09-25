package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:01 2018/8/29 0029
 */
public class StateTestOne {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(10);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(17);
        work.writeProgram();

        work.setFinish(true);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();


    }
}
