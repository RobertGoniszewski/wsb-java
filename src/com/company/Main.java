package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human("Robert", "Goniszewski", phone, "Dog");
        me.setFirstName("Robert");
        me.setLastName("Goniszewski");
        me.setPet(dog);

        me.getPet().feed();
        System.out.println(me.getPet().species);

        me.setPet(new Animal("Lion"));
        me.setPet().name = "Myszojeleń";

        System.out.println(me.getPet().species);

        me.getPet().feed();
        me.getPet().takeForAWalk();

        for (int i = 0; i < 100; i++) {
            me.getPet().takeForAWalk();
        }


        me.setCar( new Car( "Volkswagen", "Golf", 2000, 200));
        System.out.println(me.getCar().model + " " + me.getCar().producer);

        me.setSalary(1000);
        me.getSalary();
        Phone phone = new Phone("3310", "Nokia", 1999, 1.2);
        System.out.println(phone);
        System.out.println(phone.toString());

        phone.turnOn();

        Animal chomiczek = new Animal("chomik");

        Human wife = new Human("Marta", "Goniszewska", phone, chomiczek);

        try {
            me.getPet().sellMe(wife, me, 110.0);
        } catch (Exception exception) {
           exception.fillInStackTrace();
        }

    }
}
