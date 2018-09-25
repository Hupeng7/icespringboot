package com.abc.icespringboot.util.designmodesdemo.compositedemo.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:00 2018/9/3 0003
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        for (Company company : children
                ) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children
                ) {
            company.lineOfDuty();
        }
    }
}
