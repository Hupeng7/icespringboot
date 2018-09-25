package com.abc.icespringboot.util.designmodesdemo.statedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:57 2018/8/29 0029
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间: " + work.getHour()+" 下班回家");
    }
}
