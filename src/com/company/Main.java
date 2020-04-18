package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human();
        me.firstName = "Robert";
        me.lastName = "Goniszewski";
        me.pet = dog;

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Lion");
        me.pet.name = "Myszojeleń";

        me.pet.feed();
        me.pet.takeForAWalk();

        for (int i = 0; i < 100; i++) {
            me.pet.takeForAWalk();
        }

        System.out.println(me.pet.species);
    }
}
