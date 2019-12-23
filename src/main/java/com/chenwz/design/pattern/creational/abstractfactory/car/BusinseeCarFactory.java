/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 20:47
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.creational.abstractfactory.car;

public class BusinseeCarFactory implements CarFactory {
    @Override
    public BenzCar getBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslabusinessCar();
    }
}
