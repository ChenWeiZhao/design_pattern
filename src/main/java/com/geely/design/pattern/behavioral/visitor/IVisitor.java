package com.geely.design.pattern.behavioral.visitor;

/**
 * Created by geely
 */
public interface IVisitor {

    /**
     * @param freeCourse 要访问的对象作为参数
     */
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
