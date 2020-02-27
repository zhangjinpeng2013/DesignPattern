package com.zjp.designpattern.flyweight;

import java.util.HashMap;

//网站工厂类,根据需要返回一个网站
public class WebSiteFactory {
    //集合,充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
