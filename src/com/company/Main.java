package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Application;
import com.company.devices.DieselCar;
import com.company.devices.ElectricCar;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog;
        dog = new Pet("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();
        Phone phone = new Phone("3310", "Nokia", 1999, 1.2);
        Phone se = new Phone("SE", "Apple", 2016, 4.0);
        System.out.println(phone);
        System.out.println(phone.toString());

        phone.turnOn();
        ElectricCar autko = new ElectricCar("Model 3", "Tesla", 2019, 250000.0);
        ElectricCar autko2 = new ElectricCar("Model 4", "Tesla", 2020, 350000.0);
        Human me = new Human("Robert", "Goniszewski", phone, dog, autko);
        me.setFirstName("Robert");
        me.setLastName("Goniszewski");
        me.setPet(dog);

        me.getPet().feed();
        System.out.println(me.getPet().species);

        me.setPet(new Pet("Lion"));
        me.setPet(new Pet("Myszojelen"));

        System.out.println(me.getPet().species);

        me.getPet().feed();
        me.getPet().takeForAWalk();

        for (int i = 0; i < 100; i++) {
            me.getPet().takeForAWalk();
        }


        me.setCar( new DieselCar( "Volkswagen", "Golf", 2000, 10000.0),0);
        me.getCar(0).refuel();

        autko.refuel();


        System.out.println(me.getCar(0).model + " " + me.getCar(0).producer);

        me.setSalary(1000);
        me.getSalary();


        Animal chomiczek = new Pet("chomik") {
        };

        Human wife = new Human("Marta", "Goniszewska", se, chomiczek, autko2);

        try {
            me.getPet().sellMe(wife, me, 110.0);
        } catch (Exception exception) {
           exception.printStackTrace();
        }

        String[] listOfApps = {"Total Commander", "Slack", "PayPal"};

        try {
            phone.installAnApp("Firefox");
            phone.installAnApp("VLC", 18.0);
            phone.installAnApp(listOfApps);
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(me.carsInGarageWorth());

        System.out.println(me.hasFreeSpaceInGarage());
        System.out.println(me.carsInGarageWorth());
        me.getCar(1).sellMe(me,wife,100.0);
        System.out.println(autko.getOwners());
        System.out.println(autko2.getOwners());
        Application allegro = new Application("Allegro", 1.0, 0.0);
        Application theGame = new Application("theGame", 1.1, 10.0);
        Application twitterPr0 = new Application("Twitter Pr0", 23.0, 2.0);
        me.getPhone().installAnApp(me, allegro);
        me.getPhone().installAnApp(me, theGame);
        me.getPhone().installAnApp(me, twitterPr0);
        System.out.println(me.getPhone().listFreeApps());
        System.out.println(me.getPhone().appsSortedByName());
        System.out.println(me.getPhone().appsSortedByPrice());
    }
}
