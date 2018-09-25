package com.abc.icespringboot.util.designmodesdemo.builderdemo;

/**
 * @author hp
 * @version 1.0
 * @description: 建造者模式是在当创建复杂对象的算法应该独立于该对象
 *                 的组成部分以及它们的装配方式时使用的模式
 * @date: 18:33 2018/8/27 0027
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builderOne = new ConcreteBuilderOne();
        Builder builderTwo = new ConcreteBuilderTwo();

        director.construct(builderOne);
        Product productOne = builderOne.getResult();
        productOne.show();

        director.construct(builderTwo);
        Product productTwo = builderTwo.getResult();
        productTwo.show();


    }
}
