package com.chenwz.design.principle.dependenceinversion.imooc;

/**
 * 依赖倒置原则
 */
public class Geely {

    private ICourse iCourse;

    /**
     * 开放iCourse注入
     */
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


    public void studyImoocCourse() {
        iCourse.studyCourse();
    }


}
