package com.poi.unit;

public class Medic extends Unit {
    public static int count = 0;

    public Medic() {
        name = "Medic";
        unitPopulation = 1;
        hp = 60;
        atk = 0;
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
