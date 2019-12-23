package com.chenwz.design.pattern.creational.abstractfactory.course;

/**
 * Created by geely
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
