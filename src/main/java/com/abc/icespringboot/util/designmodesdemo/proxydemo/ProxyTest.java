package com.abc.icespringboot.util.designmodesdemo.proxydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:49 2018/8/27 0027
 */
public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("小小");

        ProxyPerson daili = new ProxyPerson(mm);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();


    }
}
