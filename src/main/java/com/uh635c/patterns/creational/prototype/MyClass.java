package com.uh635c.patterns.creational.prototype;

public class MyClass implements Prototype{
    private int id;
    private String name;
    private int age;

    public MyClass(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public MyClass cloneObject() {
        return new MyClass(id, name, age);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
