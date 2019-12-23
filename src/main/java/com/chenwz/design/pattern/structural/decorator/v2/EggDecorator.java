package com.chenwz.design.pattern.structural.decorator.v2;

/**
 * 附加方法
 */
public class EggDecorator extends AbstractDecorator {
    /**
     * 用父类的父类来构造
     */
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    /**
     * 在继承的基础上添加新的方法
     */
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
