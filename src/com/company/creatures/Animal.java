package com.company.creatures;

import com.company.Human;

import java.io.File;

public abstract class Animal implements Edible, Saleable, Feedable {
    final public String species;
    public String name;
    File pic;
    boolean isAlive = true;
    protected Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 30.0;
    static final Double DEFAULT_CAT_WEIGHT = 5.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = 10.0;
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = 180.0;
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = 1.0;
            weight = DEFAULT_CAT_WEIGHT;
        }
    }

    public void feed() {
        if (this.isAlive) {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        } else
            System.out.println("It's dead?");

    }

    public void takeForAWalk() {
        if (this.isAlive && this.weight > 0.2) {
            this.weight -= 0.2;
            System.out.println("What a walk! My weight is now " + weight);
        } else
            System.out.println("It's dead?");

        if (this.weight < 0.1) {
            this.isAlive = false;
        }

    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
    @Override
    public void beEaten() {
        weight = 0.0;
        System.out.println("Hungry?");
    }

    @Override
    public void food(int foodWeight) {
        System.out.println("Mmm, I like how this " + foodWeight + "kg food looks at me!");
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) {
        if (this instanceof Human) {
            System.out.println("You sell no human, m'key?");
        }else if (buyer.cash < price){
            System.out.println("No cash, no deal");
        }else
            System.out.println("You sold an animal " + this.name);
        buyer.cash -= price;
        seller.cash += price;
        buyer.setPet(this);
        seller.setPet(null);

        String.format("%s %s", System.out.printf("%s %s just sold %s to %s%n", seller.getFirstName(), seller.getLastName(), this, buyer.getFirstName()), buyer.getLastName());
    }
}
