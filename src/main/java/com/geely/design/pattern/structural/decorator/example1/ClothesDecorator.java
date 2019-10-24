/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 19:34
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.decorator.example1;

/**
 * 装饰器超类，和被装饰的对象实现同一个接口 Person
 */
public abstract class ClothesDecorator implements Person {
    //装饰器中要用被装饰器对象，构造方法中传入
    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }
}
