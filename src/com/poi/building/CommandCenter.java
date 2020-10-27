package com.poi.building;

public class CommandCenter extends Building {
    public static CommandCenter commandCenter = new CommandCenter();

    public CommandCenter() {
        super.name = "CommandCenter";
    }

    @Override
    public Building getInstance() {
        return commandCenter;
    }

}
