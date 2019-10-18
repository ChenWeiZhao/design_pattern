package com.geely.design.pattern.creational.prototype;
/**
 原型模式
 一、定义
    指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
    不需要知道任何创建的细节，不调用构造函数
    从原型实例复制克隆出新实例

 二、适用场景
    类初始化消耗较多资源，并且还要创建大量这样对象
    new产生一个对象，需要非常繁琐的过程（数据准备、访问权限）
    构造函数比较复杂
    循环体中生产大量对象时

 三、优点
    比直接new一个对象性能高
    简化创建过程

 四、缺点
    必须重写object的clone克隆方法，通过该方法进行对象拷贝
    对克隆复杂对象、对克隆出的对象复杂改造时，容易引入风险
    深拷贝、浅拷贝要运用得当

 五、扩展
    深克隆：
        对于引用类型，如果需要它们指向不同的对象，一定使用深克隆
        深克隆对于某个对象的引用类型时，要显示的去写，对于哪个属性进行深克隆

    浅克隆

 */