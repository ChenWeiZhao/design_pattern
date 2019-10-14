package com.geely.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//------------------多线程下的实例化-------------------------------
        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

//------------------序列化一个对象到文件中，在反序列化回，还是同一个对象吗？-------------------------------
        HungrySingleton hungrySingletonSerizleOut = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingletonSerizleOut);
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton hungrySingletonSerizleIn = (HungrySingleton) ois.readObject();

        //枚举类序列化与反序列化相等
        //EnumInstance instance = EnumInstance.getInstance();
        //instance.setData(new Object());
        //EnumInstance newInstance = (EnumInstance) ois.readObject();
        //System.out.println(instance.getData());
        //System.out.println(newInstance.getData());
        //System.out.println(instance.getData() == newInstance.getData());

//------------------反射攻击解决方案-------------------------------

        Class objectClass = HungrySingleton.class;
        //Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LazySingleton.class;
//        Class objectClass = EnumInstance.class;

        //获取声明的构造器
        Constructor constructor = objectClass.getDeclaredConstructor();
        //反射能改变构造器权限
        constructor.setAccessible(true);
        //反射一个线程，调用一个线程，出现多个实例
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
        HungrySingleton newHungrySingletonClass = (HungrySingleton) constructor.newInstance();
        HungrySingleton hungrySingletonClass = HungrySingleton.getInstance();

        System.out.println(hungrySingletonClass);
        System.out.println(newHungrySingletonClass);
        System.out.println(hungrySingletonClass == newHungrySingletonClass);

        //枚举类只有带参构造器，尝试通过带参获取构造器
        Class enumInstanceClass = EnumInstance.class;
        Constructor enumConstructor = enumInstanceClass.getDeclaredConstructor(String.class, int.class);
        //Constructor类源码中，若修饰符getModifiers为枚举ENUM时，则反射无法获取构造器
        EnumInstance enumNewInstance = (EnumInstance) enumConstructor.newInstance("Geely", 666);
        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.printTest();


//------------------ThreadLocalInstance-------------------------------
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
        //System.out.println("main thread"+ThreadLocalInstance.getInstance());
    }
}
