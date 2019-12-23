/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 19:36
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.structural.decorator.example1;

public class Jacket extends ClothesDecorator {

    public Jacket(Person person) {
        super(person);
    }

    /**
     * 计算累计消费
     *
     * @return
     */
    @Override
    public Double cost() {
        return person.cost() + 100;
    }

    @Override
    public void show() {
        //执行已有功能
        person.show();
        System.out.println("穿上夹克，累计消费" + this.cost());
    }
}
