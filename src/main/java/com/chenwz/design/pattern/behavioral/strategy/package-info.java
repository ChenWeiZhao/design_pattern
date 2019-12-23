/**
策略模式
 一、定义
    定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户
    大范围处理if...else...

 二、适用场景
    系统有很多类，而他们的区别仅仅在于他们的行为不同，把对象不同的行为放在不同的类里面
    一个系统需要动态地在几种算法中选择一种

 三、优点
    符合开闭原则、避免使用多重条件转移语句、提高算法的保密性和安全性

 四、缺点
    客户端必须知道所有的策略类，并自行决定使用哪个策略类
    产生很多策略类

 五、扩展
    策略模式和工厂模式
        策略模式接受已创建好的对象，从而实现不同的模式

    策略模式和状态模式
        策略模式，客户端必须知道使用什么策略，状态模式下，客户端不需要知道状态，状态会自动转换

 六、源码
 {@link java.util.Comparator}
 {@link java.util.TreeMap#comparator()}
 {@link org.springframework.core.io.Resource}
 {@link org.springframework.beans.factory.support.InstantiationStrategy} bean初始化策略


 */
package com.chenwz.design.pattern.behavioral.strategy;
