package com.poi.unit;

abstract public class Unit {
    public String name;
    public int unitPopulation;
    public int hp;
    public int atk;
    public int def;

    abstract public void killUint();

    public void printUnitInfo() {
        System.out.println("Unit-Type : " + name + ", HP : " + hp + ", ATK : " + atk + ", DEF : " + def + ", POP : " + unitPopulation);
    }

    public void printUnitInfo(int number) {
        System.out.println(number + ". Unit-Type : " + name + ", HP : " + hp + ", ATK : " + atk + ", DEF : " + def + ", POP : " + unitPopulation);
    }

    abstract public void printUnitPopulation();

    public int getUnitPopulation() {
        return unitPopulation;
    }

}
