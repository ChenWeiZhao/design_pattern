package com.chenwz.design.pattern.structural.proxy.example.staticproxy;

import java.util.Arrays;
import java.util.List;

/**
 * 静态代理
 * 路由器代理类
 */
public class RouterStaticProxy implements Internet {
    /**
     * 持有被代理类引用
     */
    private Internet modem;

    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    public RouterStaticProxy() {
        //实例化被代理类
        this.modem = new Modem();
        System.out.println("拨号上网...连接成功！");
    }

    @Override
    public void access(String url) {
        for (String keyword : blackList) {
            if (url.contains(keyword)) {
                System.out.println("禁止访问" + url);
                return;
            }
        }
        //正常访问互联网
        modem.access(url);
    }
}
