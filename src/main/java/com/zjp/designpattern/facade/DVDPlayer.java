package com.zjp.designpattern.facade;

public class DVDPlayer {
    private static DVDPlayer INSTANCE = new DVDPlayer();

    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("DVDPlayer on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void play() {
        System.out.println("DVD is playing");
    }

    public void pause() {
        System.out.println("DVD pause...");
    }
}
