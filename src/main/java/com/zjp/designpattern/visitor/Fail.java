package com.zjp.designpattern.visitor;

public class Fail extends Action {
    public void getManResult() {
        System.out.println("男人的评价:该歌手很失败");
    }

    public void getWomanResult() {
        System.out.println("女人的评价:该歌手很失败");
    }
}
