/**
备忘录模式
 一、定义
    保存一个对象的某个状态，以便在适当的时候恢复对象
    游戏存档，撤销操作，即“后悔药”

 二、适用场景
    保存及恢复数据相关业务场景，后悔时即恢复到之前的状态

 三、优点
    为用户提供一种可恢复机制，存档信息的封装

 四、缺点
    资源占用

 五、扩展
    备忘录模式和状态模式：
        备忘录模式是用实例表示状态，存档是对象的一个实例
        状态模式用类来表示状态

 六、源码
 {@link org.springframework.binding.message.StateManageableMessageContext#createMessagesMemento()}

 */
package com.chenwz.design.pattern.behavioral.memento;
