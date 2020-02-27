package com.zjp.designpattern.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        System.out.println(drink.cost());
        System.out.println(drink.getDesc());

        drink = new Milk(drink);

        System.out.println(drink.cost());
        System.out.println(drink.getDesc());

        drink = new Soy(drink);

        System.out.println(drink.cost());
        System.out.println(drink.getDesc());

    }
}
