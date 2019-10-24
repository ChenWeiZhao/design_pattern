/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 19:39
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.decorator.example1;

public class Hat extends ClothesDecorator {

    public Hat(Person person) {
        super(person);
    }

    /**
     * 计算累计消费
     *
     * @return
     */
    @Override
    public Double cost() {
        return person.cost() + 50;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("穿上帽子，累计消费" + this.cost());
    }
}
