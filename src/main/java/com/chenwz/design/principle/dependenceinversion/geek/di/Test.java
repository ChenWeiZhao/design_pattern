/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/2/1 21:52
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.dependenceinversion.geek.di;

/**
 * 依赖注入
 */
public class Test {
    public static void main(String[] args) {
        //使用Notification
        MessageSender messageSender = new SmsSender();
        Notification notification = new Notification(messageSender);
    }
}
