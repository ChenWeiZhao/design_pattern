package com.geely.design.pattern.structural.proxy.example.staticproxy;

/**
 * 调制解调器
 */
public class Modem implements Internet {
    /**
     * 实现互联网访问接口
     */
    @Override
    public void access(String url) {
        System.out.println("正在访问：" + url);
    }
}
