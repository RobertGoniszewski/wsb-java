package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.Instant;

public class Human extends Animal {
    private String firstName;
    private String lastName;
    private Phone phone;
    private Animal pet;
    private Car car;
    private double salary = 0;
    public Double cash = 100.0;

    public Human(String firstName, String lastName, Phone phone, Animal pet) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
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
    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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
