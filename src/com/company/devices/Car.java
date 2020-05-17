package com.company.devices;

import com.company.Human;
import com.company.creatures.Saleable;

public abstract class Car extends Device implements Saleable {
    public double value;
    String color;
    Integer seats;

abstract public void refuel();

    public Car(String model, String producer, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car simpson = (Car) o;
        return model.equals(simpson.model) &&
                producer.equals(simpson.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("car is turned on");
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) {
        System.out.println("Sold a car " + this.model);
    }
}