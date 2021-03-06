/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/30 19:59
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.behavioral.chainofresponsibility.example;

/**
 * 广告处理器
 */
public class AdHandler extends PostHandler {
    /**
     * 处理发帖请求
     *
     * @param post
     */
    @Override
    public Post handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("广告", "**");
        post.setContent(content);
        System.out.println("过滤广告");
        next(post);
        return post;
    }
}
