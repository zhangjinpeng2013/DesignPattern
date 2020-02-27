package com.zjp.designpattern.bridge;

public class Xiaomi implements Brand {
    public void open() {
        System.out.println("小米手机开机");
    }

    public void call() {
        System.out.println("小米手机打电话");
    }

    public void close() {
        System.out.println("小米手机关机");
    }
}
