package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:40 2018/9/27 0027
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.printf("%s 处理请求 %s", this.getClass().getSimpleName(), request);
            System.out.println();
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
