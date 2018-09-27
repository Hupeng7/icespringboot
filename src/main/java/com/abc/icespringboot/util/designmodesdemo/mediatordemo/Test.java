package com.abc.icespringboot.util.designmodesdemo.mediatordemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:56 2018/9/27 0027
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleague3 concreteColleague3 = new ConcreteColleague3(concreteMediator);
        ConcreteColleague4 concreteColleague4 = new ConcreteColleague4(concreteMediator);

        concreteMediator.setConcreteColleague3(concreteColleague3);
        concreteMediator.setConcreteColleague4(concreteColleague4);

        concreteColleague3.send("eat food");
        concreteColleague4.send("no ");


    }
}
