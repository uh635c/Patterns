package com.uh635c.patterns.creational.absrtactFactory;

public class JavaTeamFactory implements TeamFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new JavaTester();
    }
}
