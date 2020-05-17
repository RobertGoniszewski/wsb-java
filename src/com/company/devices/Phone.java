package com.company.devices;

public class Phone extends Device {
    Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone clone() {
        Phone phone = new Phone(producer, model, yearOfProduction, screenSize);
        phone.producer = this.producer;
        phone.model = this.model;
        phone.screenSize = this.screenSize;
        return phone;

    }
    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public void sellMe() {
        System.out.println("Sold a phone " + this.model);
    }

}