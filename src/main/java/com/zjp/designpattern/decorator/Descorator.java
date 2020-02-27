package com.zjp.designpattern.decorator;

public class Descorator extends Drink {
    private Drink drink;

    public Descorator(Drink drink) {
        this.drink = drink;
    }

    public float cost() {
        return getPrice() + drink.cost();
    }

    public String getDesc() {
        return desc + " && " + drink.getDesc();
    }
}
