package com.abc.icespringboot.util.designmodesdemo.prototypedemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:42 2018/8/27 0027
 */
@Data
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
