package com.abc.icespringboot.util.demo;

import java.util.Optional;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:25 2018/9/27 0027
 */
public class jdk8 {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("zhangsan");
        System.out.println(stringOptional.flatMap(e -> Optional.of("lisi")).orElse("失败"));

        stringOptional = Optional.empty();
        System.out.println(stringOptional.flatMap(e -> Optional.empty()).orElse("失败"));


    }


}
