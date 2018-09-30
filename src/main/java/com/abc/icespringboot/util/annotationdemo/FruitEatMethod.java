package com.abc.icespringboot.util.annotationdemo;

import java.lang.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:57 2018/9/30 0030
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitEatMethod {
    String eatMethod();
}
