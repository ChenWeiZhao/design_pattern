package com.chenwz.design.pattern.behavioral.mediator;

/**
 * 同事类
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
