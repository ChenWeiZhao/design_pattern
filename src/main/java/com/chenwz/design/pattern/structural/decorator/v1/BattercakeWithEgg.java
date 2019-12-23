package com.chenwz.design.pattern.structural.decorator.v1;

/**
 * 加蛋
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
