package com.uh635c.patterns.creational.builder;

public class BuilderHouse2 extends Builder{
    House house;

    @Override
    void createHouse() {
        house = new House();
    }

    @Override
    void createBuilding() {
        house.setBuilding("Stone building");
    }

    @Override
    void createPool() {
        house.setPool("Big swimming pool");
    }

    @Override
    void createSauna() {
        house.setSauna("Finland sauna");
    }

    @Override
    House getHouse() {
        return house;
    }
}
