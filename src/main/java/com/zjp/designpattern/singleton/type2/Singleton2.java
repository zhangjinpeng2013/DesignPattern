package com.zjp.designpattern.singleton.type2;

/**
 * 饿汉式(静态代码块)
 * 优缺点说明：
 * 这种方式和第一种方式类似
 * 可用，不推荐
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
