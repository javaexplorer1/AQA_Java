package ru.astondev;

public class Main {
    public static void main(String[] args) {
        Animal dogBobik = new Dog("Бобик");
        Animal dogBarbos = new Dog("Барбос");
        Animal catMurzik = new Cat("Мурзик");
        dogBobik.run(200);
        catMurzik.run(50);
        System.out.println();
        dogBarbos.swim(10);
        catMurzik.swim(15);
        System.out.println();
        Animal.getCountAnimals();
        Cat.getCountCats();
        Dog.getCountDogs();
        System.out.println();

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурка");
        cats[1] = new Cat("Соня");
        cats[2] = new Cat("Пантера");
        cats[3] = new Cat("Карамелька");
        cats[4] = new Cat("Маркиза");
        for (Cat cat : cats) {
            cat.eat(17);
        }
        System.out.println();
        Cat.printCatsSatiety(cats);
        System.out.println();

        //add food to a bowl
        Cat.addToBowl(200);
        for (Cat cat : cats) {
            cat.eat(20);
        }
        System.out.println();
        Cat.printCatsSatiety(cats);
        System.out.println();

        Figure circle = new Circle(5, "Black", "Green");
        Figure rectangle = new Rectangle(5, 10, "Red", "Brown");
        Figure triangle = new Triangle(5, 10, 12, "Yellow", "White");
        circle.printCharacteristics();
        rectangle.printCharacteristics();
        triangle.printCharacteristics();
    }
}
