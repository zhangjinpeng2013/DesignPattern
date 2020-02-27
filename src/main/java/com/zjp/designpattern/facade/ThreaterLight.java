package com.zjp.designpattern.facade;

public class ThreaterLight {
    private static ThreaterLight INSTANCE = new ThreaterLight();

    private ThreaterLight() {

    }

    public static ThreaterLight getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("ThreaterLight on ");
    }

    public void off() {
        System.out.println("ThreaterLight off");
    }

    public void dim() {
        System.out.println("ThreaterLight dim");
    }

    public void bright() {
        System.out.println("ThreaterLight bright");
    }
}
