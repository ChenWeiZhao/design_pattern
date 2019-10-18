package com.geely.design.pattern.behavioral.strategy;

/**
 * 促销活动
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行促销策略
     */
    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
