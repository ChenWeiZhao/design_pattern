package com.geely.design.pattern.structural.proxy.dynamicproxy;

import com.geely.design.pattern.structural.proxy.Order;
import com.geely.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    /**
     * 注入目标对象
     */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 通过绑定，获取动态代理类
     *
     * @return 新的增强后动态代理类
     */
    public Object bind() {
        Class cls = target.getClass();
        //实现了InvocationHandler，传this
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /**
     * @param proxy
     * @param method 要被增强的方法对象
     * @param args   具体的mthod的参数
     * @return 被增强方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    /**
     *
     * @param obj Order
     */
    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");
        //如果是订单类型的增强
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
