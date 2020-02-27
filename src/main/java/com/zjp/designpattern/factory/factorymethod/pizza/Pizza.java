package com.zjp.designpattern.factory.factorymethod.pizza;

//将Pizza做成抽象类
public abstract class Pizza {
    protected String name;

    //准备原材料，不同的Pizza不一样，因此我们做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(" baking ");
    }

    public void cut() {
        System.out.println(" cuting ");
    }

    public void box() {
        System.out.println(" boxing ");
    }

    public void setName(String name) {
        this.name = name;
    }
}
