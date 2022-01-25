package com.uh635c.patterns.creational.factoryMethod;

public class DogLover implements Human {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
