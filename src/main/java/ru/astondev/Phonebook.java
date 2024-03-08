package ru.astondev;

import java.util.*;

public class Phonebook {
    private Map<String, PhoneSet> phoneBook = new TreeMap<>();

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            phoneBook.put(name, new PhoneSet(phoneNumber));
        }
    }

    public void get(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("\nПод фамилией " + name + " числятся номера телефонов:");
            for (String phone : phoneBook.get(name).getPhoneSet()) {
                System.out.println(phone);
            }
        }
    }

    private class PhoneSet {
        private Set<String> phoneSet = new TreeSet<>();

        public PhoneSet(String phoneNumber) {
            phoneSet.add(phoneNumber);
        }

        public void add(String phoneNumber) {
            phoneSet.add(phoneNumber);
        }

        public Set<String> getPhoneSet() {
            return phoneSet;
        }
    }
}
