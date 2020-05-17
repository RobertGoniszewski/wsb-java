package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.DieselCar;
import com.company.devices.ElectricCar;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog;
        dog = new Pet("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human("Robert", "Goniszewski", phone, "Dog");
        me.setFirstName("Robert");
        me.setLastName("Goniszewski");
        me.setPet(dog);

        me.getPet().feed();
        System.out.println(me.getPet().species);

        me.setPet(new Pet("Lion"));
        me.setPet().name = "Myszojeleń";

        System.out.println(me.getPet().species);

        me.getPet().feed();
        me.getPet().takeForAWalk();

        for (int i = 0; i < 100; i++) {
            me.getPet().takeForAWalk();
        }


        me.setCar( new DieselCar( "Volkswagen", "Golf", 2000, 10000.0));
        me.getCar().refuel();
        ElectricCar autko = new ElectricCar("Model 3", "Tesla", 2019, 250000.0);
        autko.refuel();


        System.out.println(me.getCar().model + " " + me.getCar().producer);

        me.setSalary(1000);
        me.getSalary();
        Phone phone = new Phone("3310", "Nokia", 1999, 1.2);
        System.out.println(phone);
        System.out.println(phone.toString());

        phone.turnOn();

        Animal chomiczek = new Pet("chomik") {
        };

        Human wife = new Human("Marta", "Goniszewska", phone, chomiczek);

        try {
            me.getPet().sellMe(wife, me, 110.0);
        } catch (Exception exception) {
           exception.printStackTrace();
        }

        String[] listOfApps = {"Total Commander", "Slack", "PayPal"}

        try {
            phone.installAnApp("Firefox");
            phone.installAnApp("VLC", 18.0);
            phone.installAnApp(listOfApps);
        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }
}
