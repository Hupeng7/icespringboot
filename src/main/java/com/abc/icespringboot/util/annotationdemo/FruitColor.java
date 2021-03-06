package com.abc.icespringboot.util.annotationdemo;

import java.lang.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:53 2018/9/30 0030
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum Color {BLUE, RED, GREEN}

    ;


    Color fruitColor() default Color.GREEN;
}
