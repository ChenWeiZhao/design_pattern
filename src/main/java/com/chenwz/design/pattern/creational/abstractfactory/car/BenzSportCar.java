/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 20:43
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.creational.abstractfactory.car;

public class BenzSportCar implements BenzCar{

    /**
     * 加汽油
     */
    @Override
    public void gasUp() {
        System.out.println("给奔驰-跑车加98号汽油");
    }
}
