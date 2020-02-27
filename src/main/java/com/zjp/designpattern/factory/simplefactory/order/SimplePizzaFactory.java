package com.zjp.designpattern.factory.simplefactory.order;

import com.zjp.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.zjp.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.zjp.designpattern.factory.simplefactory.pizza.Pizza;
import com.zjp.designpattern.factory.simplefactory.pizza.PreparePizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (pizzaType.equals("prepare")) {
            pizza = new PreparePizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }
}
