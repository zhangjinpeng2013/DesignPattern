package com.zjp.designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}
