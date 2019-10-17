package com.geely.design.pattern.structural.decorator.v2;

/**
 * 被装饰实体的实现
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
