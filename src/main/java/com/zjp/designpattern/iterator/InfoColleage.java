package com.zjp.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoColleage implements Colleage {
    List<Department> departments;

    public InfoColleage() {
        departments = new ArrayList<Department>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
        addDepartment("服务器安全专业", "服务器安全专业");
        addDepartment("信息加密专业", "信息加密专业");
    }

    public String getName() {
        return "信息工程学院";
    }

    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    public Iterator createIterator() {
        return new InfoColleageIterator(departments);
    }
}
