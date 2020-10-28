package com.poi.game;

import com.poi.unit.Unit;

import java.util.Scanner;

import static com.poi.game.Cui.*;

public class Game {
    private static void setup() {
        unitManager.setPopulation(DEFAULT_POPULATION);

    }

    public static void main(String[] args) {

        setup();
        start();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int order = 0;
            mainMenu();
            order = scanner.nextInt();
            switch (order) {
                case BUILD:
                    buildMenu();
                    order = scanner.nextInt();
                    switch (order) {
                        case CommandCenter:
                            buildingManager.buildCommandCenter();
                            break;
                        case SupplyDepot:
                            buildingManager.buildSupplyDepot();
                            int population = DEFAULT_POPULATION + buildingManager.getSupplyPopulation();
                            unitManager.setPopulation(population);
                            break;
                        case Barrack:
                            buildingManager.buildBarrack();
                            break;
                        default:
                            System.out.println("Back to Main");
                            break;
                    }
                    break;
                case LOOKUP:
                    unitManager.printUnitList();
                    break;
                case GENERATE:
                    generateMenu();
                    order = scanner.nextInt();
                    switch (order) {
                        case SCV:
                        case MEDIC:
                        case FIREBAT:
                        case MARIN:
                            if (buildingManager.isGenerate(order)) {
                                Unit unit = unitManager.unitProduce(order);
                                unit.printUnitInfo();
                                unitManager.pushUnitList(unit);
                            }
                            break;
                        default:
                            System.out.println("Back to Main");
                            break;
                    }
                    break;
                case KILL:
                    unitManager.printUnitList();
                    int idx = scanner.nextInt();
                    unitManager.killUnit(idx);
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Wrong Option");
                    break;
            }
        }
    }

    private static final int DEFAULT_POPULATION = 10;

    private static final int BUILD = 1;
    private static final int LOOKUP = 2;
    private static final int GENERATE = 3;
    private static final int KILL = 4;
    private static final int EXIT = 5;

    private static final int SCV = 1;
    private static final int MARIN = 2;
    private static final int FIREBAT = 3;
    private static final int MEDIC = 4;

    private static final int CommandCenter = 1;
    private static final int SupplyDepot = 2;
    private static final int Barrack = 3;

    private static final BuildingManager buildingManager = new BuildingManager();
    private static final UnitManager unitManager = new UnitManager();
}
