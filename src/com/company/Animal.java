package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
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

    void feed() {
        if (this.isAlive) {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        } else
            System.out.println("It's dead?");

    }

    void takeForAWalk() {
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
}
