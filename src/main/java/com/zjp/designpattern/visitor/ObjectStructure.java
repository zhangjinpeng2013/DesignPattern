package com.zjp.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

//数据结构,管理很多人(Woman,Man)
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<Person>();

    //增加到list
    public void attach(Person person) {
        persons.add(person);
    }

    //移除
    public void detach(Person person) {
        persons.remove(person);
    }

    //显示测评情况
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
