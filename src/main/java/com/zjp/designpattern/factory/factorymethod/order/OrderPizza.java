package com.zjp.designpattern.factory.factorymethod.order;

import com.zjp.designpattern.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public abstract Pizza createPizza(String type);

    public OrderPizza() {
        String type = "";
        do {
            type = getType();
            Pizza pizza = createPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    protected String getType() {
        String type = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入所要的Pizza种类：");
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
