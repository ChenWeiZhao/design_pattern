/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 20:44
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.creational.abstractfactory.car;

public class TeslaSportCar implements TeslaCar {
    /**
     * 充电
     */
    @Override
    public void charge() {
        System.out.println("给特斯拉-跑车充满电");
    }
}
