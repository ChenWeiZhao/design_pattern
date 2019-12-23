/**
 代理模式
 一、定义
    为其他对象提供一种代理，以控制对这个对象的访问
    代理对象在客户端和目标对象之间起到中介的作用

 二、适用场景
    保护目标对象、增强目标对象

 三、优点
    能将代理对象与真实被调用的目标对象分离
    一定程度上降低系统耦合度，扩展性好
    保护、增强目标对象

 四、缺点
    会造成系统设计中类的数目增加
    在客户端和目标对象增加一个代理对象，会造成请求速度变慢
    增加系统的复杂度

 五、扩展
    静态代理：
        通过显示定义业务实现类的代理，在代理类中对同名方法进行包装，用户通过调用代理类的被包装过的方法来调用目标对象的方法，同时增强目标对象的方法
    动态代理：
        无法代理类，可以代理接口
        通过接口中的方法名，在动态生成的代理类中，调用业务实现类的同名方法
    CGLib代理：
        针对类实现进行代理，注意final修饰符
        通过继承，生成的动态代理类是业务类的子类，然后通过重写业务方法进行代理

    当Bean有实现接口时，Spring就会用JDK的动态代理，没有实现接口时，Spring使用CGlib
    可以强制使用CGlib，在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>

 代理模式和装饰者模式：
    装饰者模式是为对象加上行为，
    代理模式是控制访问，更加注重通过代理人的方式来增强目标对象,更强调的是对被代理对象的控制，而不是仅限于去装饰目标对象并增强其原有的功能


 六、源码
 {@link java.lang.reflect.Proxy}
 {@link org.springframework.aop.framework.ProxyFactoryBean} 代理工厂Bean，核心方法是getObject()
 {@link org.springframework.aop.framework.JdkDynamicAopProxy}
 {@link org.springframework.aop.framework.CglibAopProxy}
 {@link org.apache.ibatis.binding.MapperProxyFactory}
 {@link org.apache.ibatis.binding.MapperProxyFactory}
 {@link org.apache.ibatis.binding.MapperProxy}

 */
package com.chenwz.design.pattern.structural.proxy;
