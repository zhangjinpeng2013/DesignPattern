package com.zjp.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<Colleage> colleageList;

    public OutPutImpl(List<Colleage> colleageList) {
        this.colleageList = colleageList;
    }

    //遍历所有学院,然后调用 printDepartment 输出各个学院系
    public void printCollege() {
        Iterator<Colleage> iterator = colleageList.iterator();
        while (iterator.hasNext()) {
            Colleage colleage = iterator.next();
            System.out.println("------" + colleage.getName() + "------");
            printDepartment(colleage.createIterator());
        }
    }

    //输出学院 系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(((Department) iterator.next()).getName());
        }
    }
}
