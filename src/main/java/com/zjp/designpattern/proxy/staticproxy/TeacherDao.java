package com.zjp.designpattern.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    public void teach() {
        System.out.println(" 老师授课中... ");
    }
}
