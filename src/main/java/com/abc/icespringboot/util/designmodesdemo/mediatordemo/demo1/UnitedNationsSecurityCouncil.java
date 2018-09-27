package com.abc.icespringboot.util.designmodesdemo.mediatordemo.demo1;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:48 2018/9/27 0027
 */
@Data
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA colleague1;

    private Iraq colleague2;

    @Override
    public void declare(String message, Country colleague) {
        if (colleague1 == colleague) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
