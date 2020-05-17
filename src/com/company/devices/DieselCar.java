package com.company.devices;

public class DieselCar extends Car{
    public DieselCar(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer,yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("This car need diesel");
    }
}
