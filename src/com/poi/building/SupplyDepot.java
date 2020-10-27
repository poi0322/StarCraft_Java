package com.poi.building;

public class SupplyDepot extends Building {
    public static SupplyDepot supplyDepot = new SupplyDepot();

    public SupplyDepot() {
        super.name = "SupplyDepot";
    }

    public int getPopulation() {
        return this.getCount() * SUPPLE_POP;
    }

    @Override
    public Building getInstance() {
        return supplyDepot;
    }

    public static final int SUPPLE_POP = 10;
}
