package com.chenwz.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * 手记批准者
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记,批准");
            //重点：空判断
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记,不批准,流程结束");
            return;
        }
    }
}
