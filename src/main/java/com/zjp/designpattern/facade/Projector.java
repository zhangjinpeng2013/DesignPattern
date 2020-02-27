package com.zjp.designpattern.facade;

public class Projector {
    private static Projector INSTANCE = new Projector();

    public Projector() {

    }

    public static Projector getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void focus() {
        System.out.println("Projector is focus");
    }
}
