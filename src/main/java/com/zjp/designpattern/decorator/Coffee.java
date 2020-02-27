package com.zjp.designpattern.decorator;

public class Coffee extends Drink {
    public float cost() {
        return super.getPrice();
    }
}
