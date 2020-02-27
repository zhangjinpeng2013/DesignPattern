package com.zjp.designpattern.singleton.type4;

/**
 * 饿汉式(线程安全,同步方法)
 * 优缺点说明：
 *  解决了线程安全问题
 *  效率太低了，每个线程在想获得类的实例的时候，执行getInstance方法都要进行同步，
 *  其实这个方法只执行一次实例化代码就够了后面想获得该类的实例，直接return就行了
 *  方法进行同步效率太低
 * 结论：不推荐使用
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
