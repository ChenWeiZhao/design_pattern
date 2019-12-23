/**
命令模式
 一、定义
    将“请求”封装成对象，以便使用不同的请求
    命令模式解决了应用程序中对象的职责以及它们之间的通信方式
    命令模式可以使发送者和接收者完全解耦

 二、适用场景
    请求调用者和请求接受者需要解耦，使得调用者和接收者不直接交互
    需要抽象出等待执行的行为

 三、优点
    降低偶合，容易扩展新命令或者下达一组命令

 四、缺点
    命令的无限扩展会增加类的数量，调高系统的复杂度

 五、扩展


 六、源码
 {@link java.lang.Runnable} 抽象命令，实现类是命令实现
 {@link junit.framework.Test#countTestCases()} 统计此次测试有多少testCase

 */
package com.chenwz.design.pattern.behavioral.command;
