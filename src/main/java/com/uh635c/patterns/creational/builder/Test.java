package com.uh635c.patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        Builder builder1 = new BuilderHouse1();
        Builder builder2 = new BuilderHouse2();

        Director director = new Director(builder1);

        House house = director.buildHouse();
        System.out.println(house);

        director = new Director(builder2);

        House house1 = director.buildHouse();
        System.out.println(house1);
    }


}
