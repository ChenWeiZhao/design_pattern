/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 19:33
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.structural.decorator.example1;

public class LaoWang implements Person{
    /**
     * 计算累计消费
     *
     * @return
     */
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("我是赤裸的老王");
    }
}
