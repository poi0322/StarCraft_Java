package com.poi.unit;

public class Firebat extends Unit {
    public static int count = 0;

    public Firebat() {
        name = "Firebat";
        unitPopulation = 2;
        hp = 50;
        atk = 16;
        def = 2;
        count++;
    }

    @Override
    public void killUint() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("You Don't have Unit");
        }
    }

    @Override
    public void printUnitPopulation() {
        System.out.println(name + "'s population : " + count * unitPopulation);
    }
}
