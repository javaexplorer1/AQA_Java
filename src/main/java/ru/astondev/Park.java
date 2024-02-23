package ru.astondev;

import java.util.ArrayList;

public class Park {
    private ArrayList<Park.Attraction> parkAttractions = new ArrayList<>();

    public void addAttraction(Park.Attraction attraction) {
        this.parkAttractions.add(attraction);
    }

    public ArrayList<Park.Attraction> getParkAttractions() {
        return parkAttractions;
    }

    class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.printf("Аттракцион '%s':\nЧасы работы: %s\nСтоимость: %.2f руб\n\n", name, workingHours, cost);
        }
    }
}
