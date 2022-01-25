package com.uh635c.patterns.creational.factoryMethod;

public class Test {
    public static void main(String[] args) {
        Human person1 = new CatLover();
        Human person2 = new DogLover();

        person1.createPet().eat();
        person2.createPet().eat();
    }

}
