package ru.astondev;

public class Cat extends Animal {
    private static int countCats = 0;
    private static int catBowl = 50;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        limitRun = 200;
        limitSwim = -1;
        countCats++;
    }

    public static void getCountCats() {
        System.out.println("Количество созданных котов: " + countCats);
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(int value) {
        if (value >= 0 && catBowl >= value) {
            catBowl -= value;
            satiety = true;
            System.out.println("Кошка " + getName() + " поела");
        }
    }

    public static void printCatsSatiety(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.println("Кошка " + cat.getName() + (cat.isSatiety() ? " сыта" : " голодна"));
        }
    }

    public static void addToBowl(int value) {
        if (value > 0) {
            catBowl += value;
            System.out.println("В миску добавлено " + value + " единиц корма м сейчас в миске стало " + catBowl +
                    " единиц корма\n");
        }
    }
}
