package com.geely.design.pattern.behavioral.chainofresponsibility;

/**
 * 批准者
 */
public abstract class Approver {
    /**
     * 重点
     * 包含一个自己同样类型的对象
     */
    protected Approver approver;

    /**
     * 设置下一个批准者
     */
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 发布课程
     *
     * @param course 课程
     */
    public abstract void deploy(Course course);
}
