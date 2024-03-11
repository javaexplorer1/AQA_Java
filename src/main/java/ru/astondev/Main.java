package ru.astondev;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        List<Integer> integerList = Stream.generate(() -> new Random().nextInt(100))
                .limit(20)
                .collect(Collectors.toList());
        long countEven = integerList.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(integerList);
        System.out.println("Количество четных чисел: " + countEven);
        //Exercise 2
        List<String> stringList = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));
        long countHigh = stringList.stream().filter(x -> x.equals("High")).count();
        System.out.println("\nОбъект 'High' встречается в коллекции " + countHigh + " раз");
        System.out.println("Первый элемент: " + stringList.stream().findFirst().orElse("0"));
        System.out.println("Последний элемент: " + stringList.stream()
                .skip(stringList.size() == 0 ? 0 : stringList.size() - 1)
                .findFirst()
                .orElse("0"));
        System.out.println();
        //Exercise 3
        List<String> stringNumberList = new ArrayList<>(Arrays.asList("f10", "a15", "f2", "f4", "f5", "b54", "a16"));
        String[] stringNumberArray = stringNumberList.stream()
                .sorted()
                .toArray(String[]::new);
        System.out.println("Отсортированный массив:\n" + Arrays.toString(stringNumberArray));
        //Exercise 4
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        double averageManAge = students.stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .mapToDouble(s -> s.getAge())
                .average().orElse(0);
        System.out.printf("\nСредний возраст студентов мужского пола: %.1f лет\n", averageManAge);

        System.out.println("\nПолучение повестки в это году грозит студентам:");
        students.stream().filter(s -> s.getGender() == Gender.MAN && s.getAge() >= 18 && s.getAge() <= 27)
                .map(s -> s.getName())
                .forEach(System.out::println);
        //Exercise 5
        List<String> userLogins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("\nВведите логин (или пустую строку для завершения): ");
        while (!(string = scanner.nextLine()).equals("")) {
            userLogins.add(string);
            System.out.print("Введите логин (или пустую строку для завершения): ");
        }
        String[] fLogins = userLogins.stream()
                .filter(login -> login.startsWith("f"))
                .toArray(String[]::new);
        if (fLogins.length > 0) {
            System.out.println("\nЛогины начинающиеся на букву 'f':");
            Arrays.stream(fLogins).forEach(System.out::println);
        } else {
            System.out.println("\nЛогинов начинающиеся на букву 'f' нет");
        }

    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }

    private enum Gender {
        MAN,
        WOMAN
    }
}