package ru.astondev;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"244", "42322", "123134", "4543"},
                {"86544", "2772", "4242", "2133"},
                {"83244", "45752", "71134", "567"},
                {"397", "52711", "3714", "6127"}
        };
        try {
            System.out.println("Сумма элементов массива равна " + checkAndSumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неправильная размерность массива (количество строк не равно четырём)");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неправильная размерность массива (количество столбцов не равно четырём)");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (!Character.isDigit(array[i][j].charAt(k))) {
                        throw new MyArrayDataException("Некорректные данные в [" + i + "][" + j + "] ячейке массива " +
                                "(в ячейке имеется текст или символы)");
                    }
                }
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (Exception e) {
                    throw new MyArrayDataException("Некорректные данные в [" + i + "][" + j + "] ячейке массива " +
                            "(невозможно преобразовать в int)");
                }
            }
        }
        return sum;
    }
}