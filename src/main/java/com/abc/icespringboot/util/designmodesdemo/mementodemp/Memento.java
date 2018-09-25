package com.abc.icespringboot.util.designmodesdemo.mementodemp;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:38 2018/9/3 0003
 */
@Data
public class Memento {
    private String state;

    public Memento(String state) {
    }
}
