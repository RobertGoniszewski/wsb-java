package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    public boolean isAlive = true;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        isAlive = false;
        System.out.println("AAAAAAAAAAAAAAA");
    }
}
