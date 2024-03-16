package ru.astondev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box = new ArrayList<>();

    public double getWeight() {
        return box.isEmpty() ? 0 : box.size() * box.get(0).getUnitWeight();
    }

    public final void add(T... fruits) {
        Collections.addAll(box, fruits);
    }

    public <T extends Fruit> boolean compare(Box<T> anotherBox) {
        return (Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001);
    }

    public void pourFruitsTo(Box<T> anotherBox) {
        for (T fruit : box) {
        anotherBox.add(fruit);
        }
        this.box.clear();
    }
}