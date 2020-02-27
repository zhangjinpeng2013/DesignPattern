package com.zjp.designpattern.facade;

public class Popcorn {
    private static Popcorn INSTANCE = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("Popcorn on");
    }

    public void off() {
        System.out.println("Popcorn off");
    }

    public void pop() {
        System.out.println("Popcorn is poping ");
    }
}
