package com.abc.icespringboot.util.designmodesdemo.targetdemo.demo1;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:55 2018/8/31 0031
 */
@Data
public class ForeignCenter {
    private String name;

    public void 进攻() {
        System.out.printf("翻译->外籍中锋: %s 进攻", name);
        System.out.println();
    }

    public void 防守() {
        System.out.printf("翻译->外籍中锋: %s 防守", name);
    }

}
