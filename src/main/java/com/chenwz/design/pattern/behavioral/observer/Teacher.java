package com.chenwz.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者讲师
 * 观察课程，接收问题
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @param o   被观察的对象
     * @param arg 通过Observable的notifyObservers方法传递的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答:" + question.getQuestionContent());

    }
}
