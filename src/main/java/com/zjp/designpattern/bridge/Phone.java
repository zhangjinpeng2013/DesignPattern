package com.zjp.designpattern.bridge;

public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
