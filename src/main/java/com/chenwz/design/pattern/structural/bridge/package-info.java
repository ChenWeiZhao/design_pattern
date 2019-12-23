/**
 桥接模式
 一、定义
    将抽象部分与它的具体实现部分分离，使它们都可以独立地变化，即在一定程度上实现解耦
    通过组合的方式建立两个类之间联系，而不是继承

 二、适用场景
    抽象和具体实现之间增加更多灵活性，建立关联关系而非继承关系
    一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
    不希望使用继承，或因为使用继承导致类的个数激增

 三、优点
    分离抽象部分及其具体实现部分
    提高了系统的可扩展性
    符合开闭原则，合成复用原则

 四、缺点
    增加了系统的理解与设计难度
    需要正确识别出系统中两个独立变化的维度

 五、扩展
    桥接模式和组合模式
        组合模式更多强调部分和整体的组合，桥接模式强调平行级别组合
    桥接模式和适配器模式
        都是为了让2个东西配合工作，但适配器是改变已有的接口，让功能相似他们之间可以相互配合
        而桥接模式是分离抽象和具体实现，目的是分离

 六、源码

 {@link java.sql.Driver}
 {@link com.mysql.jdbc.Driver}实现了接口
 {@link java.sql.DriverManager} DriverInfo分装了Driver，
    registerDriver方法找到各家公司Connection接口真正的实现，以此真真实现数据库链接，
 {@link java.sql.Connection} 里的各种prepareStatement方法，都由Connection接口进行调用，底层肯定是加载了mysql的实现
 用这种桥接的方式，只有修改DriverManager所加载的类即可

 */
package com.chenwz.design.pattern.structural.bridge;
