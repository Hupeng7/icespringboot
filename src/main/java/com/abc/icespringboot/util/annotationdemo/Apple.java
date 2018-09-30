package com.abc.icespringboot.util.annotationdemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:53 2018/9/30 0030
 */
@Data
public class Apple {
    @FruitName
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "红富士", address = "苹果园一号大棚")
    private String appleProvider;

    @FruitEatMethod(eatMethod = "apple")
    private String eatMethod() {
        return "eat fruit" + eatMethod();
    }

    ;


}
