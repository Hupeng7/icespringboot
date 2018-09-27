package com.abc.icespringboot.util.designmodesdemo.mediatordemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:50 2018/9/27 0027
 */
public class Test1 {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil u = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(u);
        Iraq c2 = new Iraq(u);

        u.setColleague1(c1);
        u.setColleague2(c2);

        c1.declare("no arm ,or fight");
        c2.declare("fight");


    }
}
