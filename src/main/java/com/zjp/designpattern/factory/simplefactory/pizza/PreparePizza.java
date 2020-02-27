package com.zjp.designpattern.factory.simplefactory.pizza;

public class PreparePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒pizza准备原材料");
    }
}
