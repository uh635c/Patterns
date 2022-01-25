package com.uh635c.patterns.creational.builder;

public class Director {
    private Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    public House buildHouse(){
        builder.createHouse();
        builder.createBuilding();
        builder.createPool();
        builder.createSauna();

        House house = builder.getHouse();

        return house;
    }
}
