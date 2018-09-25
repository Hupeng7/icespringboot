package com.abc.icespringboot.util.designmodesdemo.proxydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:47 2018/8/27 0027
 */
public class Pursult implements GiveGift {
    SchoolGirl mm;

    public Pursult(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("送洋娃娃给" + mm.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println("送花给" + mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("送巧克力给" + mm.getName());
    }
}
