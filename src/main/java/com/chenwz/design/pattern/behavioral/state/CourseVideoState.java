package com.chenwz.design.pattern.behavioral.state;

/**
 * 课程视频状态
 */
public abstract class CourseVideoState {
    /**
     * 上下文，为了让子类状态拿到
     */
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

}
