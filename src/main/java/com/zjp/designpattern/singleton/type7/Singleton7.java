package com.zjp.designpattern.singleton.type7;

/**
 * 静态内部类
 * 这种方式采用了类装载机制来保证初始化实例时只有一个线程
 * 静态内部类在Singleton类被装载时并不会立即初始化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类,从而完成Singleton的实例化
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是我发进入的
 * 结论：推荐使用
 */
public class Singleton7 {
    private Singleton7() {
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
