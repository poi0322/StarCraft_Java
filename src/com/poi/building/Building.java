package com.poi.building;

abstract public class Building {
    public String name;
    private boolean built = false;
    private int count = 0;

    abstract public Building getInstance();

    public boolean isBuild() {
        return this.built;
    }

    public void build() {
        if (this.count == 0) {
            this.built = true;
        }
        this.count++;
        System.out.println(this.name + " is Built :: Total = " + this.count);
    }

    public void destroy() {
        this.count--;
        if (this.count < 1) {
            this.built = false;
        }
    }

    public int getCount() {
        return this.count;
    }
}
