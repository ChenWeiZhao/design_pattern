package com.geely.design.principle.dependenceinversion;

/**
 * Created by geely
 */
public class Test {

//v1  Test类作为应用层的函数，其中的修改，依赖于底层的实现，因为没有抽象
//    根据依赖倒置原则，高层次模块不应该依赖于低层次模块，而这里test的实现依赖于geely，需要引入抽象
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//    }

//v2 接口方法注入
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }

    //v3 构造器注入
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();

    }


}
