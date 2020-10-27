package com.poi.unit;

import com.poi.building.Barrack;
import com.poi.building.Building;
import com.poi.game.BuildingManager;

public class Scv extends Unit {
    BuildingManager buildingManager = new BuildingManager();
    public static int count = 0;

    public Scv() {
        name = "Scv";
        unitPopulation = 1;
        hp = 60;
        atk = 5;
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

//    public void build(String build) {
//        switch (build) {
//            case "CommandCenter" -> buildingManager.buildCommandCenter();
//            case "SupplyDepot" -> buildingManager.buildSupplyDepot();
//            case "Barrack" -> buildingManager.buildBarrack();
//        }
//    }
//
//    public void destroy(String build) {
//        switch (build) {
//            case "CommandCenter" -> buildingManager.destroyCommandCenter();
//            case "SupplyDepot" -> buildingManager.destroySupplyDepot();
//            case "Barrack" -> buildingManager.destroyBarrack();
//        }
//    }

}
