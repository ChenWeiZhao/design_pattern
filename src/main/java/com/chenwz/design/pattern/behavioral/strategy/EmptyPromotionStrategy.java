package com.chenwz.design.pattern.behavioral.strategy;

/**
 * 无促销活动
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
