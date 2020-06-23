package com.company.creatures;

import com.company.devices.Car;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getYear() == null && o2.getYear() == null){
            return 0;
        }
        if (o1.getYear() == null) {
            return -1;
        }
        if (o2.getYear() == null) {
            return 1;
        }
        return o1.getYear().compareTo(o2.getYear());
    }
}
