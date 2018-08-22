package com.abc.icespringboot.util.designmodesdemo.factorydemo;

/**
 * @author hp
 * @version 1.0
 * @description: 简单工厂模型
 * @date: 13:41 2018/8/17 0017
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case ("+"):
                operation = new OperationAdd();
                break;
            case ("-"):
                operation = new OperationSub();
                break;
            case ("*"):
                operation = new OperationMul();
                break;
            case ("/"):
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("未知的运算类型");
        }
        return operation;
    }

}
