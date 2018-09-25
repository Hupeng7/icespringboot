package com.abc.icespringboot.util.designmodesdemo.compositedemo.demo1;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:08 2018/9/3 0003
 */
public class TestOne {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财务部"));
        root.add(company1);

        System.out.println("结构图: ");
        root.display(1);

        System.out.println("职责: ");
        root.lineOfDuty();


    }
}
