package com.poi.game;

import com.poi.unit.*;

import java.util.ArrayList;

public class UnitManager {
    public static UnitManager unitManager = new UnitManager();
    private static int maximumPopulation;
    private static int totalUnitPopulation;
    public static ArrayList<Unit> units = new ArrayList<>();

    UnitManager() {
        totalUnitPopulation = 0;
    }

    public void setPopulation(int population) {
        maximumPopulation = population;
        printPopulation();
    }

    public void unitProduction(int name) {
        Unit unit = null;
        switch (name) {
            case SCV:
                unit = new Scv();
                break;
            case MARIN:
                unit = new Marin();
                break;
            case FIREBAT:
                unit = new Firebat();
                break;
            case MEDIC:
                unit = new Medic();
                break;
        }

        assert unit != null;
        unit.printUnitInfo();

        if (totalUnitPopulation + unit.unitPopulation <= maximumPopulation) {
            units.add(unit);
            totalUnitPopulation += unit.unitPopulation;
        } else {
            System.out.println("Cannot create more units");
        }
        printPopulation();
    }

    public void printUnitList() {
        int i = 0;
        if (units.isEmpty()) {
            System.out.println("No Unit's");
        } else {
            for (Unit unit : units) {
                i++;
                unit.printUnitInfo(i);
            }
        }
        printPopulation();
    }

    public void killUnit(int idx) {
        totalUnitPopulation -= units.get(idx - 1).getUnitPopulation();
        units.remove(idx - 1);    // for user
        printUnitList();
    }

    public void printPopulation() {
        System.out.println("population : " + totalUnitPopulation + " / " + maximumPopulation);
    }
//    private int calTotalUnitPopulation() {
//        totalUnitPopulation = 0;
//        for (Unit unit : units) {
//            totalUnitPopulation += unit.getUnitPopulation();
//        }
//        return totalUnitPopulation;
//    }


    private static final int SCV = 1;
    private static final int MARIN = 2;
    private static final int FIREBAT = 3;
    private static final int MEDIC = 4;

}
