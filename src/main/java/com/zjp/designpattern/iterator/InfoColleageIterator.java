package com.zjp.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {
    List<Department> departments;
    int index = -1;

    public InfoColleageIterator(List<Department> departments) {
        this.departments = departments;
    }

    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    public Object next() {
        return departments.get(index);
    }

    public void remove() {

    }
}
