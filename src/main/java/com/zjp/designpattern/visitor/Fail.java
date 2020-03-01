package com.zjp.designpattern.visitor;

public class Fail extends Action {
    public void getManResult(Man man) {
        System.out.println("男人的评价:该歌手很失败");
    }

    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价:该歌手很失败");
    }
}
