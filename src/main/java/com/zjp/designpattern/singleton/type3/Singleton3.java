package com.zjp.designpattern.singleton.type3;

/**
 * 懒汉式(线程不安全)
 * 优缺点说明：
 * 起到了Lazy Loading 的效果，但是只能在单线程下使用
 * 如果在多线程下，一个线程进入了if(instance == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断，这是就会产生多个实例。所以在多线程下不可以使用这种方式
 * 结论：实际开发中，不要使用这种模式
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
