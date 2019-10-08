package com.geely.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
