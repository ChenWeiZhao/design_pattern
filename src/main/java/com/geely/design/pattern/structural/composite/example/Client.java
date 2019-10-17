/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/17 10:20
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.composite.example;

public class Client {
    public static void main(String[] args) throws Exception {
        Node driveD = new Folder("D");

        Node doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.ppt"));
        driveD.add(doc);

        Node music = new Folder("音乐");
        Node jay = new Folder("周杰伦");
        jay.add(new File("双节棍.mp3"));
        jay.add(new File("告白气球.mp3"));

        music.add(jay);

        driveD.add(music);

        driveD.print();

    }
}
