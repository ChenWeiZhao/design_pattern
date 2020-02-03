/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/2/2 0:00
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.demeter.geek;


import java.sql.ResultSet;

public class NetworkTransporter {
    // 省略属性和其他方法...
    public Byte[] send(String address, Byte[] data) {
        //...
        return null;
    }
}

class Html{
    public Html(Byte[] rawHtml) {

    }
}

class HtmlRequest{
    public HtmlRequest(String url) {

    }

    public String getAddress() {
        return null;
    }

    public Byte[] getContent() {
        return null;

    }
}