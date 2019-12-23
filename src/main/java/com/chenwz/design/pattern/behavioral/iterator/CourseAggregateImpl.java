package com.chenwz.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程集合实现类
 */
public class CourseAggregateImpl implements CourseAggregate {

    /**
     * 课程集合
     */
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
