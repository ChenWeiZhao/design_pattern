package com.chenwz.design.pattern.creational.abstractfactory.course;

/**
 * Created by geely
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
