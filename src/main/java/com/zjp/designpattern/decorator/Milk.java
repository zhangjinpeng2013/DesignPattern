package com.zjp.designpattern.decorator;

public class Milk extends Descorator {
    public Milk(Drink drink) {
        super(drink);
        setPrice(2.0f);
        setDesc(" 牛奶 ");
    }
}
