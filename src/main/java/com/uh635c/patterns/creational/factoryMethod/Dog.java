package com.uh635c.patterns.creational.factoryMethod;

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("I am eating dog food ...");
    }
}
