package com.zjp.designpattern.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("北京大学", "北京大学天下第一");

        OrganizationComponent college = new College("计算机工程学院", "计算机工程学院天下第一");
        OrganizationComponent college1 = new College("通信工程学院", "通信工程学院好难");

        OrganizationComponent department = new Department("通信工程", "通信工程好学");
        OrganizationComponent department1 = new Department("软件工程", "软件工程有用");
        college.add(department);
        college.add(department1);

        college1.add(new Department("网络工程", "网络工程好"));
        college1.add(new Department("数字媒体工程", "数字媒体工程好"));

        university.add(college);
        university.add(college1);

        university.print();
//        college.print();
    }
}
