/**
访问者模式
 一、定义
    封装作用于某数据结构（如List/Map）中的各元素的操作
    可以在不改变各元素类的前提下，定义作用于这些元素的操作

 二、适用场景
    一个数据结构包含很多类型对象
    数据结构与数据操作分离

 三、优点
    增加新的操作很容易，即增加一个新的访问者

 四、缺点
    增加新的数据结构困难、具体元素变更比较麻烦

 五、扩展
    访问者模式和迭代器模式
        都是在某种数据结构上进行处理。
        访问者模式主要是对保存在数据结构中的元素进行某种特定处理
        迭代器模式主要是逐个遍历保存在数据结构中的元素，重点是遍历

 六、源码
 {@link java.nio.file.FileVisitor} 文件访问
 Bean定义的访问者，可以遍历bean的属性:
 {@link org.springframework.beans.factory.config.BeanDefinitionVisitor#visitBeanDefinition(org.springframework.beans.factory.config.BeanDefinition)}

 */
package com.geely.design.pattern.behavioral.visitor;
