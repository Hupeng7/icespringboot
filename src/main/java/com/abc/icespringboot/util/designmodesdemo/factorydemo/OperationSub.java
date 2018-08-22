package com.abc.icespringboot.util.designmodesdemo.factorydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:00 2018/8/17 0017
 */
public class OperationSub extends Operation {
    @Override
    public Long getResult() {
        Long result = 0L;
        result = this.getNumberA() - this.getNumberB();
        return result;
    }
}
