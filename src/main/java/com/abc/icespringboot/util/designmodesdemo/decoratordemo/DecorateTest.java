package com.abc.icespringboot.util.designmodesdemo.decoratordemo;

/**
 * @author hp
 * @version 1.0
 * @description:
 * @date: 11:33 2018/8/27 0027
 */
public class DecorateTest {
    public static void main(String[] args) {
        Person cn = new Person("菜鸟");

        System.out.println("\n第一种装扮: ");
        TShirts tShirts = new TShirts();
        Jean jean = new Jean();
        Sneakers sneakers = new Sneakers();
        Jacket jacket = new Jacket();

        tShirts.decorate(cn);
        jean.decorate(tShirts);
        sneakers.decorate(jean);
        sneakers.show();

        System.out.println("\n第二种装扮");
        Person ln = new Person("老鸟");
        sneakers.decorate(ln);
        tShirts.decorate(sneakers);
        jean.decorate(tShirts);
        jacket.decorate(jean);
        jacket.show();


    }
}
