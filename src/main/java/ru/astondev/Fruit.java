package ru.astondev;

public abstract class Fruit {
    private double unitWeight;

    public Fruit(double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public double getUnitWeight() {
        return unitWeight;
    }
}
