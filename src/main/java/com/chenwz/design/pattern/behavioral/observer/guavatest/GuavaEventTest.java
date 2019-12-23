package com.chenwz.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by geely
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        //EventBus实现观察者模式的核心类
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }

}
