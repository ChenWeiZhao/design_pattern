/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/18 13:32
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.proxy.example.dynamicproxy;

import com.geely.design.pattern.structural.proxy.example.staticproxy.Internet;
import com.geely.design.pattern.structural.proxy.example.staticproxy.Modem;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = (Internet) Proxy.newProxyInstance(Modem.class.getClassLoader(),
                Modem.class.getInterfaces(),
                new KeywordFilterDynamicProxy(new Modem()));
        internet.access("http://www.电影.com");
        internet.access("http://www.游戏.com");
        internet.access("http://www.学习.com");
        internet.access("http://www.工作.com");

        Intranet intranet = (Intranet) new KeywordFilterDynamicProxy(new Switch()).blind();
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.68.1.6\\Java知音\\设计模式是什么鬼.doc");

        /*
25            开启关键字过滤模式...
26            禁止访问：http://www.电影.com
27            禁止访问：http://www.游戏.com
28            正在访问：http://www.学习.com
29            正在访问：http://www.工作.com
30            开启关键字过滤模式...
31            禁止访问：\\192.68.1.2\共享\电影\IronHuman.mp4
32            禁止访问：\\192.68.1.2\共享\游戏\Hero.exe
33            访问内网：\\192.68.1.4\shared\Java学习资料.zip
34            访问内网：\\192.68.1.6\Java知音\设计模式是什么鬼.doc
35
36        */
    }
}
