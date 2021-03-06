package com.chenwz.design.pattern.behavioral.templatemethod;

/**
 * Created by geely
 */
public abstract class ACourse {
    /**
     * makeCourse方法不想被修改，不希望子类覆盖该方法
     */
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    /** 钩子方法 */
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();


}
