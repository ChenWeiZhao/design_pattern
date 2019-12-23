package com.chenwz.design.pattern.structural.composite;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录", 1);
        /*
         * 把目录和课程视为一个，减少使用差异，这就是组合模式的核心
         */
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();


    }
}
