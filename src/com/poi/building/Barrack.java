package com.poi.building;

public class Barrack extends Building {
    public static Barrack barrack = new Barrack();

    public Barrack() {
        super.name = "Barrack";
    }

    @Override
    public Building getInstance() {
        return barrack;
    }
}
