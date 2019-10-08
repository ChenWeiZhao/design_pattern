package com.geely.design.principle.dependenceinversion;

/**
 * 依赖倒置原则
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
