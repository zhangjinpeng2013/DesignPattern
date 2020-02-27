package com.zjp.designpattern.factory.abstractmethod.pizza;

public class BJPreparePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza准备原材料");
    }
}
