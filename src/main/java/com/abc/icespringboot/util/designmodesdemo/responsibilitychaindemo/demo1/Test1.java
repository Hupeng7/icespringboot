package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 14:15 2018/9/27 0027
 */
public class Test1 {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("经理");
        Majordomo zongjian = new Majordomo("总监");
        GeneralManager zongjingli = new GeneralManager("总经理");

        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(1);
        jinli.requestApplications(request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jinli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jinli.requestApplications(request4);


    }
}
