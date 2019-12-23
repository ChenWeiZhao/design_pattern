package com.chenwz.design.pattern.behavioral.templatemethod;

/**
 * Created by geely
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    /**
     * needWriteArticleFlag开放给应用层
     */
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
