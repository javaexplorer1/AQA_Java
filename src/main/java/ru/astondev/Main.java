package ru.astondev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkSum(7, 8));
        System.out.println();

        checkSignNumber(12);
        System.out.println();

        System.out.println(checkIfNegative(10));
        System.out.println();

        printString("I love Java", 4);
        System.out.println();

        System.out.println(isLeapYear(2024));
        System.out.println();

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replaceElements(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] arrayGrowing = arrayFill();
        System.out.println(Arrays.toString(arrayGrowing));
        System.out.println();

        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationElements(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println();

        createTwoDimensionalArray(9);
        System.out.println();

        System.out.println(Arrays.toString(createOneDimensionalArray(7, 28)));
    }

    public static boolean checkSum(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum >= 10 && sum <= 20;
    }

    public static void checkSignNumber(int number) {
        if (number >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    public static boolean checkIfNegative(int number) {
        return number < 0;
    }

    public static void printString(String aString, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(aString);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void replaceElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    public static int[] arrayFill() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void multiplicationElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void createTwoDimensionalArray(int dimension) {
        int[][] array = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((i == j) || (j == dimension - i - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        for (int[] ints : array) {
            for (int aNumber : ints) {
                System.out.print(aNumber + "  ");
            }
            System.out.println();
        }
    }

    public static int[] createOneDimensionalArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}