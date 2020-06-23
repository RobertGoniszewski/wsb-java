package com.company.devices;

import com.company.Human;
import com.company.creatures.Saleable;

public abstract class Car extends Device implements Saleable {
    public double value;
    String color;
    Integer seats;
    private Integer year;

    abstract public void refuel();

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

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
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {

        for (Car car : seller.getGarage()
        ) {
            if (car != this) {
                throw new Exception("Seller doesn't own that car.");
            }
        }
        if (buyer.cash < price) {
            throw new Exception("Buyer don't have enough money.");
        } else if (!buyer.hasFreeSpaceInGarage()) {
            throw new Exception("Yo, buyer, you don't have space for this car!");
        } else {
            if (buyer.getGarage()[0] == null) {
                buyer.setCar(this, 0);
                buyer.cash -= price;
                seller.cash += price;
                System.out.println("Car was sold and money exchanged.");
            } else {
                buyer.setCar(this, 1);
                buyer.cash -= price;
                seller.cash += price;
                System.out.println("Car was sold and money exchanged.");
            }
        }


        System.out.println("Sold a car " + this.model);
    }
}