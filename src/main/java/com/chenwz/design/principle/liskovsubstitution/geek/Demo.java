/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/1/31 16:28
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.liskovsubstitution.geek;


import javax.xml.ws.Response;

public class Demo {

    public void demoFunction(Transporter transporter) {
        Request request = new Request();
        //...省略设置request中数据值的代码...
        Response response = transporter.sendRequest(request);
        //...省略其他逻辑...
    }
}

// 里式替换原则
//    Demo demo = new Demo();
//demo.demofunction(new SecurityTransporter(/*省略参数*/););