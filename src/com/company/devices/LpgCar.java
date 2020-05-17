package com.company.devices;

public class LpgCar extends Car{
    public LpgCar(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer,yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("This car need LPG");
    }
}
