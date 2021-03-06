/**
建造者模式
 一、定义
    将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
    用户只需要指定需要建造的类型就可以得到它们，建造过程及细节不需要知道

 二、适用场景
    如果一个对象有非常复杂的内部结构（非常多属性、步骤）
    想把复杂对象的创建和使用分离

 三、优点
    封装性好，创建和使用分离
    扩展性好、建造类之间独立、一定程度解耦

 四、缺点
    产生多余builder对象
    产品内部发生变化，建造者需要修改，成本大

 五、建造者模式与工厂模式区别
    建造者模式更注重于方法调用顺序，工厂模式注重于创建产品，不关心顺序
    建造者可以创建比较复杂的产品，不但要创建产品，还要知道产品的组成

 六、源码
 {@link java.lang.StringBuilder#append(int)}
 {@link org.springframework.beans.factory.support.BeanDefinitionBuilder}
 {@link org.apache.ibatis.session.SqlSessionFactoryBuilder#build(org.apache.ibatis.session.Configuration)}

 */
package com.chenwz.design.pattern.creational.builder;
