/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/1/31 16:26
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.liskovsubstitution.geek;


import sun.net.www.http.HttpClient;

import javax.xml.ws.Response;

public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Response sendRequest(Request request) {
        // ...use httpClient to send request
        return null;
    }
}

class Request {
    public void addPayload(String s, String appId) {

    }
}
