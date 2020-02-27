package com.zjp.designpattern.factory.simplefactory.order;

import com.zjp.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.zjp.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.zjp.designpattern.factory.simplefactory.pizza.Pizza;
import com.zjp.designpattern.factory.simplefactory.pizza.PreparePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        String pizzaType = "";
        Pizza pizza = null;
        do {
            pizzaType = getType();
            pizza = SimplePizzaFactory.createPizza(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        String type = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入Pizza种类：");
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
