package com.company.devices;

import com.company.Human;
import com.company.creatures.Saleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable {
    public double value;
    String color;
    Integer seats;
    private Integer year;
    List<Human> owners = new ArrayList<Human>();

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

    public List<Human> getOwners() {
        return owners;
    }

    public void setOwner(Human owner) {
        this.owners.add(owner);
    }

    public int trensfersList() {
        return this.owners.size();
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
            if (car != this && this.owners.get(this.owners.size() - 1) == seller) {
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
                this.owners.add(buyer);
            } else {
                buyer.setCar(this, 1);
                buyer.cash -= price;
                seller.cash += price;
                System.out.println("Car was sold and money exchanged.");
                this.owners.add(buyer);
            }
        }


        System.out.println("Sold a car " + this.model);
    }
}