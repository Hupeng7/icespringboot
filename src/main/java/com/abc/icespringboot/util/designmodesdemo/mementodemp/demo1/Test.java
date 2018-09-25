package com.abc.icespringboot.util.designmodesdemo.mementodemp.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:58 2018/9/3 0003
 */
public class Test {
    public static void main(String[] args) {
        GameRole before = new GameRole();
        before.getInitState();
        before.stateDisplay();

        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(before.saveState());

        before.fight();
        before.stateDisplay();

        before.recoveryState(stateAdmin.getMemento());
        before.stateDisplay();

    }
}
