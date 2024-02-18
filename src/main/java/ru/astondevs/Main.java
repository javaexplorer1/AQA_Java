package ru.astondevs;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();    // to split the output

        checkSumSign();
        System.out.println();

        printColor();
        System.out.println();

        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 889;
        int b = -4750;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 21545852;
        int b = 842434;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}
