package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 被观察者课程（主题对象）
 * 继承Observable
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    /**
     * 提交问题
     *
     * @param course
     * @param question
     */
    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个问题");
        setChanged();
        //通知观察者
        notifyObservers(question);

    }


}
