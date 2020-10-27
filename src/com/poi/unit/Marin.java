package com.poi.unit;

public class Marin extends Unit {
    public static int count = 0;

    public Marin() {
        name = "Marin";
        unitPopulation = 1;
        hp = 40;
        atk = 6;
        def = 1;
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
