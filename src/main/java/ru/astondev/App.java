package ru.astondev;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            throw new IllegalArgumentException("Недопустимое значение параметра " +
                    "(параметр должен быть равен нулю или быть больше нуля)");
        }
        int factorialValue = 1;
        for (int i = 1; i <= number; i++) {
            factorialValue *= i;
        }
        return factorialValue;
    }
}