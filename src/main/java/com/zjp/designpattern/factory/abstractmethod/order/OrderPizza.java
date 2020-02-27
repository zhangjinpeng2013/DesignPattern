package com.zjp.designpattern.factory.abstractmethod.order;

import com.zjp.designpattern.factory.abstractmethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    private void setFactory(AbsFactory factory) {
        this.absFactory = factory;
        String type = "";
        do {
            type = getType();
            Pizza pizza = absFactory.createPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = "";
        try {
            System.out.println("请输入要订购的pizza类型：");
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
