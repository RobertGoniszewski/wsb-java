package com.company.devices;

public class ElectricCar extends Car{
    public ElectricCar(String model, String producer, int yearOfProduction, double value) {
        super(model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("This car need a charger");
    }
}
