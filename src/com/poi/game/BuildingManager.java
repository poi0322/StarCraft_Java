package com.poi.game;

import com.poi.building.*;

public class BuildingManager {
    public static BuildingManager buildingManager = new BuildingManager();
    private final CommandCenter commandCenter = new CommandCenter();
    private final SupplyDepot supplyDepot = new SupplyDepot();
    private final Barrack barrack = new Barrack();

    public BuildingManager() {
    }

    public void buildCommandCenter() {
        commandCenter.build();
    }

    public void destroyCommandCenter() {
        commandCenter.destroy();
    }

    public void buildSupplyDepot() {
        if (commandCenter.isBuild()) {
            supplyDepot.build();
        } else {
            System.out.println("You must build CommandCenter First");
        }
    }

    public void destroySupplyDepot() {
        supplyDepot.destroy();
    }

    public int getSupplyPopulation() {
        return supplyDepot.getPopulation();
    }

    public void buildBarrack() {
        if (commandCenter.isBuild()) {
            barrack.build();
        } else {
            System.out.println("You must build CommandCenter First");
        }
    }

    public void destroyBarrack() {
        barrack.destroy();
    }

    public boolean isGenerate(int name) {
        switch (name) {
            case SCV:
                if (commandCenter.isBuild())
                    return true;
                else
                    System.out.println("You must build CommandCenter First");
                break;
            case MARIN:
            case FIREBAT:
            case MEDIC:
                if (barrack.isBuild())
                    return true;
                else
                    System.out.println("You must build Barrack First");
                break;
            default:
                break;
        }
        return false;
    }


    private static final int SCV = 1;
    private static final int MARIN = 2;
    private static final int FIREBAT = 3;
    private static final int MEDIC = 4;
}
