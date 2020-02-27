package com.zjp.designpattern.builder;

public class CommonHouse extends AbsHouse {
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    public void roofed() {
        System.out.println("普通房子建屋顶");
    }
}
