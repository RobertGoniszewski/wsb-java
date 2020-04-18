package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal();

        dog.species = "Dog";
        dog.name = "Haiko";
        dog.weight = 47.0;

        System.out.println("Hi, I'm " + dog.name);
        System.out.println("My weight is " + dog.weight);

        dog.feed();

        System.out.println("My weight is " + dog.weight);

        Human me = new Human();
        me.firstName = "Robert";
        me.lastName = "Goniszewski";
        me.pet.feed();

        System.out.println(me.pet.species);

        me.pet = new Animal();
        me.pet.species = "Lion";
        me.pet.name = "Myszojeleń";
        me.pet.weight = 190.0;
    }
}
