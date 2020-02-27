package com.zjp.designpattern.factory.abstractmethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪pizza准备原材料");
    }
}
