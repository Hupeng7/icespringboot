package com.abc.icespringboot.util.designmodesdemo.bridgedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:53 2018/9/26 0026
 */
public class BridgeTest {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();


    }


}
