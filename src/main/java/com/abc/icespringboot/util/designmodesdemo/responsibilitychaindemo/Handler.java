package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:35 2018/9/27 0027
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);


}
