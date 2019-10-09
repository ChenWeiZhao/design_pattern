package com.geely.design.principle.singleresponsibility;

/**
 * 单一职责原则
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
