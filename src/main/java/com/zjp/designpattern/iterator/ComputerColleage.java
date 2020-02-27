package com.zjp.designpattern.iterator;

import java.util.Iterator;

public class ComputerColleage implements Colleage {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerColleage() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("php专业", "php专业");
        addDepartment("大数据专业", "大数据专业");
        addDepartment("人工智能专业", "人工智能专业");
    }

    public String getName() {
        return "计算机学院";
    }

    public void addDepartment(String name, String desc) {
        departments[numOfDepartment] = new Department(name, desc);
        numOfDepartment++;
    }

    public Iterator createIterator() {
        return new ComputerColleageIterator(departments);
    }
}
