package com.zjp.designpattern.builder.improve;

public abstract class HouseBuilder {
    protected House house;

    public abstract void buildBasise();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
