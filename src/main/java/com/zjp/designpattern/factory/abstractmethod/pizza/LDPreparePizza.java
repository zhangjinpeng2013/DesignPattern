package com.zjp.designpattern.factory.abstractmethod.pizza;

public class LDPreparePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza准备原材料");
    }
}
