package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:55 2018/9/27 0027
 */
public abstract class Manager {
    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);


}
