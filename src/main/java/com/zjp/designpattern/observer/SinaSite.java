package com.zjp.designpattern.observer;

public class SinaSite implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("----新浪网站----");
        System.out.println("气温:" + temperature);
        System.out.println("气压:" + pressure);
        System.out.println("湿度:" + humidity);
    }

}
