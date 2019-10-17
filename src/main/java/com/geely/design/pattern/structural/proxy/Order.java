package com.geely.design.pattern.structural.proxy;

/**
 * 订单实体
 */
public class Order {
    /**
     * 订单数据
     */
    private Object orderInfo;
    /**
     * 订单属于哪个用户
     */
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
