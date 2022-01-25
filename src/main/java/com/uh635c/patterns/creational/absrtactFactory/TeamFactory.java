package com.uh635c.patterns.creational.absrtactFactory;

public interface TeamFactory {
    Developer createDeveloper();
    Tester createTester();
}
