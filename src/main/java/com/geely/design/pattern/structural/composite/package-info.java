package com.geely.design.pattern.structural.composite;
/**
 组合模式
 一、定义
    将对象组合成树形结构以表示“部分-整体”的层次结构
    组合模式使客户端对单个对象和组合对象保持一致的方式处理

 二、适用场景
    希望客户端可以忽略组合对象与单个对象的差异时
    处理一个树形结构

 三、优点
    清楚定义分层次的复杂对象，表示对象全部或部分层次
    让客户端忽略了层次的差异，方便对整个层次结构进行控制
    简化客户端代码
    符合开闭原则

 四、缺点
    限制类型时会较为复杂
    使设计变得更加抽象

 五、扩展
    组合模式和访问者模式
        可以使用访问者模式访问组合模式的递归结构

 六、源码
 将相同的抽象类或接口类的实例转换为树状结构
 把父类作为方法入参
 {@link java.awt.Container} add方法
 {@link java.util.HashMap} putAll方法
 {@link java.util.ArrayList} addAll方法

 2、把多个对象组合为一个对象，简化对多个对象的访问
 关键：叶子对象和组合对象都要实现相同的接口、或继承相同的抽象类，这样才能够将叶子节点对象和组合好的对象，进行一致处理
 {@link org.apache.ibatis.scripting.xmltags.SqlNode}
 {@link org.apache.ibatis.scripting.xmltags.MixedSqlNode} 相当于课程目录
 {@link org.apache.ibatis.scripting.xmltags.WhereSqlNode}
 */