package com.zjp.designpattern.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        SinaSite sinaSite = new SinaSite();

        //注册到weatherData
        weatherData.registerObserver(sinaSite);

        System.out.println("通知各个注册的观察者,看看信息");
        weatherData.setData(20f, 100f, 30f);
    }
}
