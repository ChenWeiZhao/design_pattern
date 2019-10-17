package com.geely.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录类
 */
public class CourseCatalog extends CatalogComponent {
    /**
     * 存了多个父类
     */
    private List<CatalogComponent> components = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;


    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    /**
     * 通过方法行为识别
     * 把父类作为入参
     */
    @Override
    public void add(CatalogComponent catalogComponent) {
        this.components.add(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        this.components.remove(catalogComponent);
    }

    /**
     * 循环遍历父类
     */
    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : components) {
            if (this.level != null) {
                //根据层级拼接空格
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }

}
