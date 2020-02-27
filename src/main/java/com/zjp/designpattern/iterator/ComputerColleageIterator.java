package com.zjp.designpattern.iterator;

import java.util.Iterator;

public class ComputerColleageIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public ComputerColleageIterator(Department[] departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (position < departments.length && departments[position] != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    //删除的方法,默认空实现
    public void remove() {

    }
}
