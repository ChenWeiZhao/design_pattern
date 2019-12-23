package com.chenwz.design.pattern.creational.builder.example;

/**
 * 施工方接口
 */
public interface Builder {
    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();
}
