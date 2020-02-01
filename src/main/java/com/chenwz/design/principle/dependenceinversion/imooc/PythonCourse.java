package com.chenwz.design.principle.dependenceinversion.imooc;

/**
 * 依赖倒置原则
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
