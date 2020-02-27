package com.zjp.designpattern.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        //客户端要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        User user1 = new User();
        user1.setName("tom");
        webSite1.use(user1);

        //客户端要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        User user2 = new User();
        user2.setName("jim");
        webSite2.use(user2);

        //客户端要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        User user3 = new User();
        user3.setName("jack");
        webSite3.use(user3);

        System.out.println(factory.getWebSiteCount());
    }
}
