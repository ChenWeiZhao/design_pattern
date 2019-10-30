/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/30 19:54
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.behavioral.chainofresponsibility.example;

/**
 * 帖子处理器
 */
public abstract class PostHandler {
    /**
     * 后继者
     */
    protected PostHandler successorPostHanler;

    public void setSuccessorPostHanler(PostHandler postHanler) {
        this.successorPostHanler = postHanler;
    }

    /**
     * 处理发帖请求
     * 处理请求的 handlerRequest 的入参和返回类型可以根据实际情况修改，可以在该方法中抛出异常来中断请求。
     */
    public abstract Post handlerRequest(Post post);

    /**
     * 当请求传递到最后一个责任对象时，已经没有后继者继续处理请求了，因此要对 successor 做判空处理，避免抛出空指针异常
     *
     * @param post
     */
    protected final void next(Post post) {
        if (this.successorPostHanler != null) {
            this.successorPostHanler.handlerRequest(post);
        }
    }

}
