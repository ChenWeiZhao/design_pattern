package com.chenwz.design.pattern.structural.decorator.example1;

/**
 * 被装饰对象
 */
public interface Person {
    /**
     * 计算累计消费
     *
     * @return
     */
    public Double cost();

    public void show();

}
