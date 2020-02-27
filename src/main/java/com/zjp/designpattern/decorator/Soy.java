package com.zjp.designpattern.decorator;

public class Soy extends Descorator {
    public Soy(Drink drink) {
        super(drink);
        setPrice(1.0f);
        setDesc(" 豆浆 ");
    }
}
