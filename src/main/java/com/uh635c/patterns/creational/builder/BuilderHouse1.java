package com.uh635c.patterns.creational.builder;

public class BuilderHouse1 extends Builder{
    House house;

    @Override
    void createHouse() {
        house= new House();
    }

    @Override
    void createBuilding() {
        house.setBuilding("Wood Building");
    }

    @Override
    void createPool() {
        house.setPool("Swimming pool");
    }

    @Override
    House getHouse() {
        return house;
    }
}
