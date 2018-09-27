package com.abc.icespringboot.util.designmodesdemo.mementodemp.demo1;

import javax.management.relation.Role;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:50 2018/9/3 0003
 */
public class GameRole {
    private int vit;

    private int atk;

    private int def;

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void stateDisplay() {
        System.out.println("角色当前状态: ");
        System.out.printf("体力: %d", this.vit);
        System.out.printf("攻击力: %d", this.atk);
        System.out.printf("防御力: %d", this.def);
        System.out.println();
    }

    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }


}
