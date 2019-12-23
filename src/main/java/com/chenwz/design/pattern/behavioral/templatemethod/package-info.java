/**
 模板方法模式
 一、定义
    定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
    模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤

 二、适用场景
    一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
    各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复

 三、优点
    提高复用性、提高扩展性、符合开闭原则

 四、缺点
    类数目增加、增加了系统实现复杂度、
    继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍

 五、扩展
    钩子方法：提供缺省行为，必要时扩展，是对子类更进一层的开放和扩展

 模板方法和工厂方法
    工厂方法是模板方法的一种特殊实现

 模板方法和策略模式
    都有封装算法、
    策略模式是使不同的算法可以相互替换，并且不影响应用层客户端使用
    有大量if-else时可以考虑使用策略模式，不同的if-else都是不同的策略

 六、源码
 {@link java.util.Arrays#sort(int[])}
 {@link java.util.AbstractList#addAll(int, java.util.Collection)}
 {@link javax.servlet.http.HttpServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)}
 {@link org.apache.ibatis.executor.BaseExecutor}

 */
package com.chenwz.design.pattern.behavioral.templatemethod;
