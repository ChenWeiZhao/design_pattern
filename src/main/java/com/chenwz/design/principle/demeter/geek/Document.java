/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/2/1 23:58
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.demeter.geek;


public class Document {
    private Html html;
    private String url;

    public Document(String url, Html html) {
        this.html = html;
        this.url = url;
    }
    //...
}


