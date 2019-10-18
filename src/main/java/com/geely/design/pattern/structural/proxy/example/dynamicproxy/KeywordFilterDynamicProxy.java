/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/18 13:17
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.proxy.example.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class KeywordFilterDynamicProxy implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    /** 被代理的真实对象,猫、交换机、或是别的什么都是。 */
    private Object origin;

    public KeywordFilterDynamicProxy(Object origin) {
        //注入被代理对象
        this.origin = origin;
        System.out.println("开启关键字过滤模式...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //要被切入方法面之前的业务逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)){
                System.out.println("禁止访问："+arg);
                return null;
            }
        }
        //调用真实的被代理对象方法
        return method.invoke(origin, args);
    }

    public Object blind(){
        Class<?> clazz = this.origin.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
}
