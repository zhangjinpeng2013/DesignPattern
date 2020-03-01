package com.zjp.designpattern.visitor;

public class Man extends Person {
    public void accept(Action action) {
        action.getManResult(this);
    }
}
