package com.company.devices;

public class Application {
    String name;
    Double version;
    Double price;

    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getVersion() {
        return version;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
