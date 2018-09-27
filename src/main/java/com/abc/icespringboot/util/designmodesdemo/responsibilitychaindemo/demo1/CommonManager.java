package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:01 2018/9/27 0027
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
