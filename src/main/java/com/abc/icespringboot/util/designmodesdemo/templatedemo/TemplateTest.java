package com.abc.icespringboot.util.designmodesdemo.templatedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:21 2018/8/27 0027
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("甲的试卷: ");
        TestPageOne testPageOne = new TestPageOne();
        testPageOne.question1();
        testPageOne.question2();

        System.out.println("--------------------");
        System.out.println("乙的试卷: ");
        TestPageTwo testPageTwo = new TestPageTwo();
        testPageTwo.question1();
        testPageTwo.question2();


    }

}
