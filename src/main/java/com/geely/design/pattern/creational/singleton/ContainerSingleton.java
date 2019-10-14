package com.geely.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 基于容器的单例模式，和享元类似
 * 用于统一管理多个单例
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    /**
     * HashMap不是线程安全的
     * Hashtable线程安全，但是影响性能
     */
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }


}
