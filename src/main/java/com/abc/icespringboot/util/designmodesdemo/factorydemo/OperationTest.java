package com.abc.icespringboot.util.designmodesdemo.factorydemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:06 2018/8/17 0017
 */
public class OperationTest {
    public static void main(String[] args) {
        Operation operationA;
        operationA = OperationFactory.createOperation("+");
        operationA.setNumberA(1L);
        operationA.setNumberB(2L);
        System.out.println(operationA.getNumberA() + "与" + operationA.getNumberB() + "运算后为: " + operationA.getResult());

        Operation operationB;
        operationB = OperationFactory.createOperation("/");
        operationB.setNumberA(4L);
        operationB.setNumberB(0L);
        System.out.println(operationB.getResult());

        Operation operationC;
        operationC = OperationFactory.createOperation("^");
        operationC.setNumberA(3L);
        operationC.setNumberB(2L);
        System.out.println(operationC.getResult());


    }
}
