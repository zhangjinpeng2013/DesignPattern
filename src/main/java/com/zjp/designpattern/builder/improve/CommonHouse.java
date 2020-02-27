package com.zjp.designpattern.builder.improve;

public class CommonHouse extends HouseBuilder {

    public void buildBasise() {
        System.out.println("普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
