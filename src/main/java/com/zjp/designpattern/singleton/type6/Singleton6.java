package com.zjp.designpattern.singleton.type6;

/**
 * 双重检查
 * 优缺点说明：
 *  Double-Check概念是多线程开发中经常用到的，如代码所示，我们进行了两次if(instance == null)检查，这样就可以保证线程安全了
 *  这样，实例化代码只执行一次，后面再次访问时，判断if(instance == null)，直接return实例化对象，也避免了反腐进行方法同步
 *  线程安全，延迟加载，效率较高
 * 结论：推荐使用
 */
public class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
