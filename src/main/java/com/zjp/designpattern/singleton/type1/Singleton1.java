package com.zjp.designpattern.singleton.type1;

/**
 * 饿汉式(静态变量)
 * 优点:
 * 这种写法比较简单,就是在类装载的时候就完成实例化。避免了线程同步问题
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果，如果从始至终未使用过这个实例，则会造成内存浪费
 * <p>
 * 结论：这种单例模式可用，但是会造成内存浪费
 */

public class Singleton1 {
    private final static Singleton1 instance = new Singleton1();

    public Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
