package com.abc.icespringboot.designmodes.abstractfactorypattern;

/**
 * 3.抽象工厂模式（Abstract Factory Pattern）
 * 定义：Provide an interface for creating families of related or dependent objects
 * without specifying their concrete classes.
 * （为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。）
 * <p>
 * 使用场景：
 * 一个对象族（或是一组没有任何关系的对象）都有相同的约束。
 * 涉及不同操作系统的时候，都可以考虑使用抽象工厂模式
 */

/**
 * @author Administrator
 */
public abstract class AbstractCreator {
    /**
     * A
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * B
     * @return
     */
    public abstract AbstractProductB createProductB();

}
