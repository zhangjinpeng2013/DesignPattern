package com.zjp.designpattern.factory.factorymethod.order;

import com.zjp.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.zjp.designpattern.factory.factorymethod.pizza.BJPreparePizza;
import com.zjp.designpattern.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("prepare")) {
            pizza = new BJPreparePizza();
        }
        return pizza;
    }
}
