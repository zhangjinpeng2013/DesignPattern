package com.zjp.designpattern.factory.factorymethod.order;

import com.zjp.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import com.zjp.designpattern.factory.factorymethod.pizza.LDPreparePizza;
import com.zjp.designpattern.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("prepare")) {
            pizza = new LDPreparePizza();
        }
        return pizza;
    }
}
