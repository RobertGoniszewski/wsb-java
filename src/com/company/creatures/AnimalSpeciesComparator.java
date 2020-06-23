package com.company.creatures;

import java.util.Comparator;

public class AnimalSpeciesComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1 == null && o2 == null){
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.species.compareTo(o2.species);
    }
}
