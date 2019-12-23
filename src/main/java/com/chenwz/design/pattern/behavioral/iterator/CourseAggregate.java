package com.chenwz.design.pattern.behavioral.iterator;

/**
 * 课程集合抽象类
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    /**
     * 获得课程迭代器
     */
    CourseIterator getCourseIterator();



}
