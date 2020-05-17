package com.company.devices;
import com.company.Saleable;

public abstract class Device implements Saleable{
    public String producer;
    public String model;
    int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device: " + getClass().getName() +" Model: " + model + " Producer: " + producer +" Year of production: " + yearOfProduction;
    }
}