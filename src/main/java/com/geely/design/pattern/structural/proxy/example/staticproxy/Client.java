/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/18 13:10
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.proxy.example.staticproxy;

import com.geely.design.pattern.structural.proxy.example.staticproxy.Internet;
import com.geely.design.pattern.structural.proxy.example.staticproxy.RouterStaticProxy;

public class Client {
    public static void main(String[] args) {
        Internet proxy = new RouterStaticProxy();
        proxy.access("http://www.电影.com");
        proxy.access("http://www.游戏.com");
        proxy.access("ftp://www.学习.com/java");
        proxy.access("http://www.工作.com");

       /* 运行结果
        拨号上网...连接成功！
        禁止访问：http://www.电影.com
        禁止访问：http://www.游戏.com
        正在访问：ftp://www.学习.com/java
        正在访问：http://www.工作.com
        */
    }
}
