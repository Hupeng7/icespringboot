package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:20 2018/8/31 0031
 */
public class AdapterTest {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Center("姚明");
        ym.attack();
        ym.defense();

        Player ymNew = new Translator("姚明");
        ymNew.attack();
        ymNew.defense();

    }
}
