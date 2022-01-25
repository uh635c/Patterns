package com.uh635c.patterns.structural.decorator;

public class Test {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());

        System.out.println(developer.doJob());
    }
}
