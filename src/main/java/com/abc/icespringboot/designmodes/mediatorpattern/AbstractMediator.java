package com.abc.icespringboot.designmodes.mediatorpattern;

/**
 * 8.中介者模式
 * 定义：Define an object that encapsulates how a set of objects interact.AbstractMediator promotes loose coupling by keeping objects
 * from referring to each demoone explicitly,and it lets you vary their interaction independently.
 * （用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。）
 * <p>
 * ● AbstractMediator 抽象中介者角色
 * 抽象中介者角色定义统一的接口，用于各同事角色之间的通信。
 * ● Concrete AbstractMediator 具体中介者角色
 * 具体中介者角色通过协调各同事角色实现协作行为，因此它必须依赖于各个同事角色。
 * ● Colleague 同事角色
 * 每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作。每个同事类的行为分为两种：
 * 一种是同事本身的行为，比如改变对象本身的状态，处理自己的行为等，这种行为叫做自发行为（Self-Method），
 * 与其他的同事类或中介者没有任何的依赖；
 * 第二种是必须依赖中介者才能完成的行为，叫做依赖方法（Dep-Method）。
 * <p>
 * ps：使用同事类注入而不使用抽象注入的原因是因为抽象类中不具有每个同事类必须要完成的方法。即每个同事类中的方法各不相同。
 * <p>
 * 问：为什么同事类要使用构造函数注入中介者，而中介者使用getter/setter方式注入同事类呢？
 * 这是因为同事类必须有中介者，而中介者却可以只有部分同事类。
 * <p>
 * 使用场景：
 * 中介者模式适用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构，即每个类都与其他的类有直接的联系。
 */

/**
 * @author Administrator
 */
public abstract class AbstractMediator {
    /**
     * 定义同事类
     */
    protected ConcreteColleaguel c1;
    protected ConcreteColleague2 c2;

    /**
     * 通过getter/setter 方法把同事类注入进来
     * @return
     */
    public ConcreteColleaguel getC1() {
        return c1;
    }

    public void setC1(ConcreteColleaguel c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    /**
     * 中介者模式的业务逻辑
     */
    public abstract void doSomething1();

    /**
     * 中介者模式的业务逻辑
     */
    public abstract void doSomething2();
}
