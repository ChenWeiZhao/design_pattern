package com.chenwz.design.principle.demeter.imooc;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 */
public class TeamLeader {
    /**
     * 查课程数量
     */
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0 ;i < 20;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }

}
