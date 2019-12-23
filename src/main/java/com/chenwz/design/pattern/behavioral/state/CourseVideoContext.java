package com.chenwz.design.pattern.behavioral.state;

/**
 * 上下文
 */
public class CourseVideoContext {
    /**
     * 引用课程视频状态，互相引用
     */
    private CourseVideoState courseVideoState;

    //这里可使用享元模式
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        //设置状态
        this.courseVideoState = courseVideoState;
        //把环境通知到各个实现类
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void stop() {
        this.courseVideoState.stop();
    }

    public void pause() {
        this.courseVideoState.pause();
    }
}
