package ru.astondev;

public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        limitRun = 500;
        limitSwim = 10;
        countDogs++;
    }

    public static void getCountDogs() {
        System.out.println("Количество созданных собак: " + countDogs);
    }
}
