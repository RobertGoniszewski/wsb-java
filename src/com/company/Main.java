package com.company;

import devices.Car;
import devices.Phone;

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

        System.out.println(me.pet.species);

        me.pet.feed();
        me.pet.takeForAWalk();

        for (int i = 0; i < 100; i++) {
            me.pet.takeForAWalk();
        }


        me.car = new Car( "Volkswagen", "Golf", "2000", 200);
        me.car.color = "grey";
        me.car.seats = 5;

        System.out.println(me.car.make);
        me.setSalary(1000);
        me.getSalary();
        Phone phone = new Phone("3310", "Nokia", "1999",1.3);
        System.out.println(phone);

        car.turnOn();
        phone.turnOn();
    }
}
