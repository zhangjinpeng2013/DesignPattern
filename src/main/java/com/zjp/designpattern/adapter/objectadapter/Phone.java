package com.zjp.designpattern.adapter.objectadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        int dstV = iVoltage5V.output5V();
        if (dstV == 5) {
            System.out.println("输出5V,可以充电");
        } else {
            System.out.println("输出电压不对");
        }
    }
}
