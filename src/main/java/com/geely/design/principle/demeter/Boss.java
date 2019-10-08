package com.geely.design.principle.demeter;


/**
 * 迪米特法则
 * Boss只用给TeamLeader下指令，不关心course
 */
public class Boss {
    /**
     * 下指令查课程数量
     */
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
