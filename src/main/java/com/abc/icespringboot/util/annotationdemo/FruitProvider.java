package com.abc.icespringboot.util.annotationdemo;

import java.lang.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:58 2018/9/30 0030
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    public int id() default -1;

    public String name() default "";

    public String address() default "";


}
