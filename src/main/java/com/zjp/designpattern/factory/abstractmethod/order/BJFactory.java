package com.zjp.designpattern.factory.abstractmethod.order;

import com.zjp.designpattern.factory.abstractmethod.pizza.BJCheesePizza;
import com.zjp.designpattern.factory.abstractmethod.pizza.BJPreparePizza;
import com.zjp.designpattern.factory.abstractmethod.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new BJPreparePizza();
        }
        return pizza;
    }
}
