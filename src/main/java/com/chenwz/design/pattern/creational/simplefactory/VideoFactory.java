package com.chenwz.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 */
public class VideoFactory {
    /**
     *  通过反射，弥补简单工厂的扩展性
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }


    //public Video getVideo(String type) {
    //    if ("java".equalsIgnoreCase(type)) {
    //        return new JavaVideo();
    //    } else if ("python".equalsIgnoreCase(type)) {
    //        return new PythonVideo();
    //    }
    //    return null;
    //}

}
