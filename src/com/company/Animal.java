package com.company;

import java.io.File;

public class Animal {
    String species;
    String name;
    Double weight;
    File pic;

    public Animal(String species) {
        this.species = species;
    }

    void feed(){ // void nie zwraca zadnych danych, najprostsza metoda
        weight++;
        System.out.println("Thx, my weight is now " + weight);
    }
}
