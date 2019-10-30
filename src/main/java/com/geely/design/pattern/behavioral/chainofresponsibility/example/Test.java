/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/30 20:02
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.behavioral.chainofresponsibility.example;

public class Test {
    public static void main(String[] args) {
        //创建责任对象
        PostHandler adHandler = new AdHandler();
        PostHandler yellowHandler = new YellowHandler();
        PostHandler swHandler = new SensitiveWordsHandler();

        //形成责任链
        adHandler.setSuccessorPostHanler(yellowHandler);
        yellowHandler.setSuccessorPostHanler(swHandler);

        Post post = new Post();
        post.setContent("我是正常内容，我是广告，我是涉黄，我是敏感词，我是正常内容");

        System.out.println("过滤前的内容为：" + post.getContent());
        post = adHandler.handlerRequest(post);
        System.out.println("过滤后的内容为：" + post.getContent());
    }
}
