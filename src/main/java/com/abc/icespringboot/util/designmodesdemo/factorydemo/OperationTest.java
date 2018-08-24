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
        String operate = "+";
        operationA = OperationFactory.createOperation(operate);
        operationA.setNumberA(1L);
        operationA.setNumberB(2L);
        System.out.println(operationA.getNumberA() + operate + operationA.getNumberB() + " = " + operationA.getResult());

        Operation operationB;
        operate = "/";
        operationB = OperationFactory.createOperation(operate);
        operationB.setNumberA(4L);
        operationB.setNumberB(0L);
        System.out.println(operationB.getResult());

        Operation operationC;
        operate = "^";
        operationC = OperationFactory.createOperation(operate);
        operationC.setNumberA(3L);
        operationC.setNumberB(2L);
        System.out.println(operationC.getResult());


    }
}
