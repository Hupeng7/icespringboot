package com.abc.icespringboot.util.designmodesdemo.proxydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:56 2018/8/27 0027
 */
public class ProxyPerson implements GiveGift {
    Pursult gg;

    public ProxyPerson(SchoolGirl mm) {
        this.gg = new Pursult(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
