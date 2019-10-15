package com.geely.design.pattern.structural.decorator.v2;

/**
 * 装饰者
 */
public abstract class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    /**
     * 用抽象煎饼，来构造抽象装饰者
     */
    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
