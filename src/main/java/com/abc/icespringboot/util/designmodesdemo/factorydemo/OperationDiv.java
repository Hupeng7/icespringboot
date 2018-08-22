package com.abc.icespringboot.util.designmodesdemo.factorydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:02 2018/8/17 0017
 */
public class OperationDiv extends Operation {
    @Override
    public Long getResult() {
        Long result = 0L;
        if (this.getNumberB() == 0) {
            throw new RuntimeException("除数不能为0");
        }
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
