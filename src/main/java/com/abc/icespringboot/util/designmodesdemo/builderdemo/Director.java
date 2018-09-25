package com.abc.icespringboot.util.designmodesdemo.builderdemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: 指挥者：根据用户的需求构建对象
 * @date: 18:32 2018/8/27 0027
 */
@Data
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
