package com.uh635c.patterns.structural.bridge;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}