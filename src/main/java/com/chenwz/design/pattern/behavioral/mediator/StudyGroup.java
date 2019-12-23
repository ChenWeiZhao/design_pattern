package com.chenwz.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 中介者，学习群
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
