package com.uh635c.patterns.creational.builder;

public abstract class Builder {

    abstract void createHouse();

    abstract void createBuilding();
    void createPool(){}
    void createSauna(){}

    abstract House getHouse();

}
