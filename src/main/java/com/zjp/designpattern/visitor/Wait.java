package com.zjp.designpattern.visitor;

public class Wait extends Action {
    public void getManResult() {
        System.out.println("男人的评价:该歌手待定");
    }

    public void getWomanResult() {
        System.out.println("女人的评价:该歌手待定");
    }
}
