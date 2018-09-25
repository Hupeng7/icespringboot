package com.abc.icespringboot.util.designmodesdemo.builderdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * @version 1.0
 * @description: 具体产品
 * @date: 18:21 2018/8/27 0027
 */
public class Product {
    List<String> list = new ArrayList<String>();

    public void add(String part) {
        list.add(part);
    }

    public void show() {
        System.out.println("产品 创建---");
        for (String part : list) {
            System.out.println(part);
        }
    }


}
