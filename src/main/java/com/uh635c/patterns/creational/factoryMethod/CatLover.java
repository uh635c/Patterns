package com.uh635c.patterns.creational.factoryMethod;

public class CatLover implements Human{
    @Override
    public Pet createPet() {
        return new Cat();
    }
}
