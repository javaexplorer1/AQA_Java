package ru.astondev;
/*
Необходимо написать программу, позволяющую выполнить следующее:
1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
3. Для хранения фруктов внутри коробки можно использовать ArrayList;
4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны,
false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
7. Не забываем про метод добавления фрукта в коробку.
*/

public class Main {
    public static void main(String[] args) {
        //box1 of apples
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Box<Apple> box1Apple = new Box<>();
        box1Apple.add(apple1, apple2, apple3, apple4);
        //box2 of apples
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Box<Apple> box2Apple = new Box<>();
        box2Apple.add(apple5, apple6);
        //box3 of oranges
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Box<Orange> box3Orange = new Box<>();
        box3Orange.add(orange1, orange2, orange3, orange4);
        System.out.println("Исходный вес коробок:");
        System.out.println("Вес box1Apple = " + box1Apple.getWeight());
        System.out.println("Вес box2Apple = " + box2Apple.getWeight());
        System.out.println("Вес box3Orange = " + box3Orange.getWeight());
        //comparison of boxes
        System.out.println("Проверка равенства веса box1Apple и box2Apple: " + box1Apple.compare(box2Apple));
        System.out.println("Проверка равенства веса box1Apple и box3Orange: " + box1Apple.compare(box3Orange));
        box2Apple.pourFruitsTo(box1Apple);
        System.out.println("\nВес коробок после перекладывания фруктов из коробки box2Apple в коробку box1Apple:");
        System.out.println("Вес box1Apple = " + box1Apple.getWeight());
        System.out.println("Вес box2Apple = " + box2Apple.getWeight());
        System.out.println("Вес box3Orange = " + box3Orange.getWeight());
        //comparison of boxes
        System.out.println("Проверка равенства веса box1Apple и box2Apple: " + box1Apple.compare(box2Apple));
        System.out.println("Проверка равенства веса box1Apple и box3Orange: " + box1Apple.compare(box3Orange));
    }
}
