package com.abc.icespringboot.util.designmodesdemo.builderdemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 18:30 2018/8/27 0027
 */
public class ConcreteBuilderTwo extends Builder {
    Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public void buildPartC() {
        product.add("部件Z");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
