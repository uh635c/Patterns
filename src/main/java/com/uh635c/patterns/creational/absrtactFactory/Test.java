package com.uh635c.patterns.creational.absrtactFactory;

public class Test {
    public static void main(String[] args) {
        TeamFactory javaTeam = new JavaTeamFactory();
        Developer developer = javaTeam.createDeveloper();
        Tester tester = javaTeam.createTester();

        System.out.println("java team is working");
        developer.writeCode();
        tester.testCode();

        TeamFactory pythonTeam = new PythonTeamFactory();
        developer = pythonTeam.createDeveloper();
        tester = pythonTeam.createTester();

        System.out.println("\npython team is working");
        developer.writeCode();
        tester.testCode();
    }
}
