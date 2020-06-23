package com.company.creatures;

import com.company.Human;

public interface Saleable {
    void sellMe(Human buyer, Human seller, Double price) throws Exception;

}