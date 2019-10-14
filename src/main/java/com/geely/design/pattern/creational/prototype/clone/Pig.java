package com.geely.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * Created by geely
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆，即连同引用类型的属性一起克隆
        //否则浅克隆出的对象还是原有的引用对象
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
