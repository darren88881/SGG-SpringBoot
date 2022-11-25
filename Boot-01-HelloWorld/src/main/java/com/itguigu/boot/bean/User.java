package com.itguigu.boot.bean;

/**
 *
 * @Author darren
 * @Date 2022/11/25 22:03
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
