package com.geely.design.principle.interfacesegregation;
/*
    接口隔离原则

    一、定义
        用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不使用的接口
        一个类对另一个类的依赖应该建立在最小的接口上
        建立单一职责接口，不要建立庞大臃肿的接口
        尽量细化接口，接口方法尽量少

    二、原则
        注意适度原则，一定要适度

    三、优点
        符合高内聚低耦合的设计思想，从而使得类具有很好的可读性，可扩展性和可维护性

 */