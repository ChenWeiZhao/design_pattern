package com.geely.design.pattern.creational.abstractfactory.car;

public interface CarFactory {
    BenzCar getBenzCar();

    TeslaCar getTeslaCar();
}
