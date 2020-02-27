package com.zjp.designpattern.factory.abstractmethod.order;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
