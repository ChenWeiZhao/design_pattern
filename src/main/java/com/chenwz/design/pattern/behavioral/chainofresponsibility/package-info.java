/**
责任链模式
 一、定义
    为请求创建一个接收此次请求对象的链，链条中每个元素即是一个对象

 二、适用场景
    一个请求的处理需要多个对象当中的一个或多个协作处理

 三、优点
    请求的发送者和接收者（请求的处理者）解耦
    责任链可以动态组合

 四、缺点
    责任链太长，或者处理时间过长，影响性能

 五、扩展
    责任链模式和状态模式
        责任链模式中，各个对象并不指定下一个处理对象者是谁，只有在客户端里设定顺序以及元素
        状态模式，让每个状态对象直到下一个处理对象是谁

 六、源码
 {@link javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)}
 {@link javax.servlet.FilterChain#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse)} 责任链条

 */
package com.chenwz.design.pattern.behavioral.chainofresponsibility;
