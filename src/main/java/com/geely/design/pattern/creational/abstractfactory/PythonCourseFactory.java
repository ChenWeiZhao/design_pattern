package com.geely.design.pattern.creational.abstractfactory;

/**
 * Python课程产品族：生成同一个产品的工厂
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
