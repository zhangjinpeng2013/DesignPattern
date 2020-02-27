package com.zjp.designpattern.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪pizza准备原材料");
    }
}
