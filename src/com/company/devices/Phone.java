package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    Double screenSize;
    static final String server = "localhost";
    static final String protocol = "http";
    static final Double version = 1.0;


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

    public void installAnApp(String name) {

    }
    public void installAnApp(String name, Double version) {

    }
    public void installAnApp(String name, Double version, String server) {

    }
    public void installAnApp(Url address) {

    }

    public void  installAnApp(String ...names) {
        for (String name : names) {
            installAnApp(name);
        }
    }
    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) {
        System.out.println("Sold a phone " + this.model);

    }
}