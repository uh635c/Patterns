package com.uh635c.patterns.structural.bridge;

public class PythonDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Python developer writes python code...");
    }
}
