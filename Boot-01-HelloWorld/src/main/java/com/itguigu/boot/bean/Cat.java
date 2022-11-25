package com.itguigu.boot.bean;

/**
 *
 * @Author darren
 * @Date 2022/11/25 21:41
 */
public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
