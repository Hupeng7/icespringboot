package com.abc.icespringboot.util.designmodesdemo.prototypedemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:28 2018/8/27 0027
 */
@Data
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;

    }

    public void setWorkExperience(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.setName(this.name);
        obj.setSex(this.sex);
        obj.setAge(this.age);
        return obj;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", work=" + work +
                '}';
    }


}
