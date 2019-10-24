package com.geely.design.pattern.creational.abstractfactory.course;

/**
 * JAVA课程产品族：生成同一个产品的工厂
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
