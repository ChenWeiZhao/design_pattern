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

// 站内信发送类
public class InboxSender implements MessageSender {
    @Override
    public void send(String cellphone, String message) {
        //....
    }
}