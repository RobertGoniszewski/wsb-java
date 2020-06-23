package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {
    Double screenSize;
    static final String server = "localhost";
    static final String protocol = "http";
    static final Double version = 1.0;
    List<Application> installedApps = new ArrayList<Application>();


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

    public boolean isAppInstalled(Application app) {
        if (this.installedApps.contains(app)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAppInstalled(String app) {
        for (Application application: installedApps) {
            if (application.name.equals(app)) {
                return true;
            }
        }
        return false;
    }

    public String listFreeApps() {
        List<String> apps = new ArrayList<String>();
        for (Application application: installedApps) {
            if (application.price.equals(0.0)) {
                apps.add(application.name);
            }
        }
        return apps.toString();
    }

    public Double allAppsPrice(){
        Double price = 0.0;
        for (Application application: installedApps) {
            price += application.price;
        }
        return price;
    }

    public String appsSortedByName(){
        List<String> apps = new ArrayList<String>();
        for (Application application: installedApps) {
            apps.add(application.name);
        }
        Collections.sort(apps);
        return apps.toString();
    }

    public String appsSortedByPrice(){
        List<Application> apps = new ArrayList<>(installedApps);
       apps.sort(new ApplicationByPriceComparator());

        return apps.toString();
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
    public void installAnApp(Human human, Application app) {
        if (human.cash > app.price) {
            installedApps.add(app);
            System.out.println("App was purchased!");
            human.cash -=app.price;
        } else {
            System.out.println("You don't have enough money, sorry.");
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