package com.zjp.designpattern.factory.abstractmethod.order;

import com.zjp.designpattern.factory.abstractmethod.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String type);
}
