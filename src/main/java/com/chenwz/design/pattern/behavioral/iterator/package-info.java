/**
迭代器模式
 一、定义
    提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示

 二、适用场景
    访问一个集合对象的内容而无需暴露它的内部表示
    为遍历不同的集合提供一个统一的接口

 三、优点
    分离了集合对象的遍历行为

 四、缺点
    类的个数成对增加，因为是将存储数据和遍历数据分离

 五、扩展
    迭代器模式和访问者模式
        访问者模式扩展开放的部分作用于对象的操作上
        迭代器模式扩展开放的部分作用域集合的种类上

 六、源码
 {@link java.util.ArrayList#listIterator()}
 {@link org.apache.ibatis.cursor.defaults.DefaultCursor#iterator()}

 */
package com.chenwz.design.pattern.behavioral.iterator;
