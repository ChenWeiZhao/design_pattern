package com.geely.design.pattern.behavioral.iterator;

/**
 * 课程迭代器
 */
public interface CourseIterator {
    /**
     * 获取下一个课程
     */
    Course nextCourse();

    /**
     * 该课程是否是最后一个课程
     */
    boolean isLastCourse();

}
