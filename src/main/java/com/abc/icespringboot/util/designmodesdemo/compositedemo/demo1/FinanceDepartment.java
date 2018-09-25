package com.abc.icespringboot.util.designmodesdemo.compositedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:06 2018/9/3 0003
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + "公司财务收支管理");
    }
}
