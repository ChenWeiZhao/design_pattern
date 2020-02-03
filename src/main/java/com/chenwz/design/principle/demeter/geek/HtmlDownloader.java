/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/2/2 0:01
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.demeter.geek;


public class HtmlDownloader {
    private NetworkTransporter transporter;//通过构造函数或IOC注入

    // HtmlDownloader这里也要有相应的修改
    public Html downloadHtml(String url) {
        HtmlRequest htmlRequest = new HtmlRequest(url);
        Byte[] rawHtml = transporter.send(htmlRequest.getAddress(), htmlRequest.getContent());
        return new Html(rawHtml);
    }
}