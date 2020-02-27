package com.zjp.designpattern.facade;

public class Stereo {
    private static Stereo INSTANCE = new Stereo();

    private Stereo() {

    }

    public static Stereo getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void up() {
        System.out.println("Stereo up");
    }
}
