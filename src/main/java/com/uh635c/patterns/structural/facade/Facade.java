package com.uh635c.patterns.structural.facade;

public class Facade {
    private Developer developer;
    private Tester tester;
    private Manager manager;

    public Facade() {
        developer = new Developer();
        tester = new Tester();
        manager = new Manager();
    }

    public void workProject(){
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
