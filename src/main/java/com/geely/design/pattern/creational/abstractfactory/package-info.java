package com.geely.design.pattern.creational.abstractfactory;
/**
    简单工厂

    一、定义
        抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
        无须指定它们具体的类

    二、适用场景
        应用层（客户端）不依赖于产品类实例如何被创建、实现等细节
        强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码
        提供一个产品类库，所有产品以同样的接口出现，从而使客户端不依赖于具体实现

    三、优点
        具体产品在应用层代码隔离，不需关心创建细节
        将一个系列的产品族统一到一起创建

    四、缺点
        规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
        增加了系统的抽象性和理解难度

    五、产品族与产品等级结构
        产品族：同一个工厂生产，位于不同的产品等级结构（海尔洗衣机、海尔冰箱）
        产品等级结构：不同工厂生产的同一类产品（美的空调、海尔空调）

        工厂方法，针对的是产品等级结构
        抽象工厂，针对的是产品族
        指出产品所属的等级结构、族就能唯一确定产品

    从某个工厂中取出产品，肯定属于同一个产品族，这就是抽象工厂模式解决的问题
    当一个工厂可以创建属于不同产品等级结构的一个产品族中所有对象，这时就用抽象工厂
 */