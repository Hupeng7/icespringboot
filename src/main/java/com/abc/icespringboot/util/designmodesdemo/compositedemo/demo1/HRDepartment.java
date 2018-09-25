package com.abc.icespringboot.util.designmodesdemo.compositedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:04 2018/9/3 0003
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {

    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
