package com.zjp.designpattern.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        adapter.m1();
    }
}
