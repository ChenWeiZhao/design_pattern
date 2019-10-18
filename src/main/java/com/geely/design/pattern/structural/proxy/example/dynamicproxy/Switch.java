/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/18 13:14
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.proxy.example.dynamicproxy;

public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网" + path);
    }
}
