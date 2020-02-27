package com.zjp.designpattern.visitor;

public class Woman extends Person {
    public void accept(Action action) {
        action.getWomanResult();
    }
}
