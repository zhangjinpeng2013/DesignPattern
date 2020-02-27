package com.zjp.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 天气信息
 * 管理观察者
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private List<Observer> observers;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObservers();
    }

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    public void notifyObservers() {
        observers.stream().forEach(a -> {
            a.update(this.temperature, this.pressure, this.humidity);
        });
    }
}
