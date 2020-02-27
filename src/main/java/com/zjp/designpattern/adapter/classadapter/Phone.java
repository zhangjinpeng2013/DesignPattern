package com.zjp.designpattern.adapter.classadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        int dstV = iVoltage5V.output5V();
        if (dstV == 5) {
            System.out.println("电压为5V,可以充电");
        } else {
            System.out.println("电压不等于5V,不能充电");
        }
    }
}
