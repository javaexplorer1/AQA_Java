package ru.astondev;

public interface Figure {
    String getName();

    String getFillColor();

    String getBorderColor();

    double area();

    default double perimeter() {
        return Math.sqrt(4 * area() * Math.PI);
    }

    default void printCharacteristics() {
        System.out.printf("%s имеет площадь = %.2f, периметр = %.2f, цвет фона - %s, цвет границ - %s%n",
                getName(), area(), perimeter(), getFillColor(), getBorderColor());
    }
}
