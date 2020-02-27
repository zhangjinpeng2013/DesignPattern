package com.zjp.designpattern.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊pizza准备原材料");
    }
}
