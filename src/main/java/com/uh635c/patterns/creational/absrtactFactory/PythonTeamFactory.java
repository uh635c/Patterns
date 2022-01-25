package com.uh635c.patterns.creational.absrtactFactory;

public class PythonTeamFactory implements TeamFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester createTester() {
        return new PythonTester();
    }
}
