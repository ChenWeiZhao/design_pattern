package com.chenwz.design.pattern.behavioral.strategy;

/**
 * 满减促销粗略
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
