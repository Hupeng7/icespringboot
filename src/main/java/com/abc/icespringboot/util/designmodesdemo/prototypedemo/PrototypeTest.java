package com.abc.icespringboot.util.designmodesdemo.prototypedemo;

/**
 * @author hp
 * @version 1.0
 * @description: 原型模型
 *  涉及到浅复制 和 深复制
 *  看过帖子 说慎用这种深复制
 * @date: 16:34 2018/8/27 0027
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("ln");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xxx");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("1998-2006", "yyy");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("女", "24");

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);


    }
}
