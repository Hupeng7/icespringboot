package com.abc.icespringboot.util.designmodesdemo.mementodemp.demo1;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:51 2018/9/3 0003
 */
@Data
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}
