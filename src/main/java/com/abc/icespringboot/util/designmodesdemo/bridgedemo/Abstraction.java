package com.abc.icespringboot.util.designmodesdemo.bridgedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:49 2018/9/26 0026
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }

}
