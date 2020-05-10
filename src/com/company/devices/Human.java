package com.company.devices;

import com.company.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.Instant;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private double salary = 0;

    public Human(String firstName, String lastName, Phone phone, Animal pet) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }

    public double getSalary() {
        System.out.println("Salary as on " + Instant.now() + "(UTC) is " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            System.out.println("New data was sent to Accounting Dept.");
            System.out.println("You need to go to Mrs. Hania in Staff Dept. for new annex.");
            System.out.println("And, oh, there's no need to hide your income. ZUS and US already knows about it.");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (salary>car.value) {
            System.out.println("Car bought with cash.");
            this.car = car;
        }else if (Math.round(car.value/12.0)<salary) {
            System.out.println("Car bought in installments");
            this.car = car;
        }else {
            System.out.println("You can't afford it, sorry.");
        }
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
