package com.zjp.designpattern.composite;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    public void print() {
        System.out.println(getName());
    }
}
