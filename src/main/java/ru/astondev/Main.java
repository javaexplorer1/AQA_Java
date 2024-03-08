package ru.astondev;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Азбука", "Кедр", "Лестница", "Вертолет", "Азбука", "Архитектор", "Бумеранг", "Азбука",
                "Вертолет", "Портрет", "Козырек", "Компонент", "Лестница", "Дисплей", "Лестница", "Бланк", "Лестница",
                "Маяк", "Факел", "Вертолет"};
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String elementOfArray : array) {
            if (!treeMap.containsKey(elementOfArray)) {
                treeMap.put(elementOfArray, 1);
            } else {
                int count = treeMap.get(elementOfArray);
                treeMap.put(elementOfArray, ++count);
            }
        }
        System.out.println("Список уникальных слов:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("\nКоличество повторов слов:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
        }

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7(495)252-42-50");
        phonebook.add("Петров", "+7(495)252-42-52");
        phonebook.add("Петров", "+7(495)252-42-51");
        phonebook.add("Петров", "+7(495)252-42-72");
        phonebook.add("Сидоров", "+7(495)252-42-65");
        phonebook.add("Иванов", "+7(495)252-42-49");
        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
    }
}
