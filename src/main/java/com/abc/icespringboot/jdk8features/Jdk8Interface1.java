package com.abc.icespringboot.jdk8features;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:36 2018/10/8 0008
 */
public interface Jdk8Interface1 {
    // 1.接口中可以定义静态方法了
    public static void staticMethod() {
        System.out.println("Jdk8Interface1 接口中的静态方法");
    }

    //2.使用default 之后就可以定义普通方法的方法体了
    public default void defaultMethod() {
        System.out.println("Jdk8Interface1 接口中的默认方法");
    }

}
