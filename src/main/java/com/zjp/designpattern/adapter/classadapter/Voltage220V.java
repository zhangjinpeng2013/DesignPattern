package com.zjp.designpattern.adapter.classadapter;

//被适配的类
public class Voltage220V {
    public int output220V() {
        int srcV = 220;
        System.out.println("电压=" + srcV);
        return srcV;
    }
}
