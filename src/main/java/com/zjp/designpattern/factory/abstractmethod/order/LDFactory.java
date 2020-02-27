package com.zjp.designpattern.factory.abstractmethod.order;

import com.zjp.designpattern.factory.abstractmethod.pizza.LDCheesePizza;
import com.zjp.designpattern.factory.abstractmethod.pizza.LDPreparePizza;
import com.zjp.designpattern.factory.abstractmethod.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("pepper")) {
            pizza = new LDPreparePizza();
        }
        return pizza;
    }
}
