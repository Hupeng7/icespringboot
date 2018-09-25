package com.abc.icespringboot.util.designmodesdemo.templatedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:13 2018/8/27 0027
 */
public class Questions {

    public void question1() {
        System.out.println("明天天气是:A晴天 B雨天 C大风天 D星期天");
        System.out.println("答案是:" + answer1());
    }

    protected String answer1() {
        return "";
    }

    public void question2() {
        System.out.println("吃什么是:A鸡鸭 B鱼肉 C米饭 D水饺");
        System.out.println("答案是:" + answer2());
    }

    protected String answer2() {
        return "";
    }

}
