package com.zjp.designpattern.visitor;

public abstract class Action {
    //得到男性的测评
    public abstract void getManResult();

    //得到女性的测评
    public abstract void getWomanResult();
}
