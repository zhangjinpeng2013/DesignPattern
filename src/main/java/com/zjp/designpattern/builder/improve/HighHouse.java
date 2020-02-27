package com.zjp.designpattern.builder.improve;

public class HighHouse extends HouseBuilder {
    public void buildBasise() {
        System.out.println("高房子打地基");
    }

    public void buildWalls() {
        System.out.println("高房子砌墙");
    }

    public void roofed() {
        System.out.println("高房子盖屋顶");
    }
}
