package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:56 2018/8/29 0029
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间: " + work.getHour() + " 不行了，睡着了");
    }
}
