package com.zjp.designpattern.visitor;

public class Success extends Action {
    public void getManResult() {
        System.out.println("男人给的评价:该歌手很成功");
    }

    public void getWomanResult() {
        System.out.println("女人给的评价:该歌手很成功");
    }
}
