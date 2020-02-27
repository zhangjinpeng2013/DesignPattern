package com.zjp.designpattern.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        IVoltage5V iVoltage5V = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(iVoltage5V);
    }
}
