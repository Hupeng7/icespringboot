package com.abc.icespringboot.util.designmodesdemo.builderdemo;

/**
 * @author hp
 * @version 1.0
 * @description: 具体建造者。实现Builder接口、构造和装配各个部件
 * @date: 18:27 2018/8/27 0027
 */
public class ConcreteBuilderOne extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public void buildPartC() {
        product.add("部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
