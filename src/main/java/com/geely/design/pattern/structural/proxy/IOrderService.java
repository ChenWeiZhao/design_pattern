package com.geely.design.pattern.structural.proxy;

/**
 * 目标对象
 */
public interface IOrderService {
    /**
     * 保存订单
     * 被增强方法
     */
    int saveOrder(Order order);
}
