package com.geely.design.principle.demeter;
/*
    迪米特法则（最少知道原则）

    一、定义
        一个对象应该对其它对象保持最少的了解
        尽量降低类与类之间的偶合

    二、原则
        强调只和朋友交流，不和陌生人说话
        朋友：出现在成员变量、方法的输入、输出参数中类称为成员朋友类，
            而出现在方法体内部的类不属于朋友类
            对外部引入的类越少越好

    三、优点
        降低类之间的偶合

 */