package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:09 2018/9/27 0027
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.printf("%s : %s 数量 %s 再说吧", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        }
    }
}
