package com.zjp.designpattern.facade;

public class Screen {
    private static Screen INSTANCE = new Screen();

    private Screen() {

    }

    public static Screen getInstance() {
        return INSTANCE;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }
}
