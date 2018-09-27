package com.abc.icespringboot.util.designmodesdemo.bridgedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:51 2018/9/26 0026
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
