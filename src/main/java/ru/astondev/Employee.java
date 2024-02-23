package ru.astondev;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //additional constructor for entering date of birth in the format dd.mm.yyyy to calculate age
    public Employee(String fullName, String position, String email, String phone, double salary, String dateOfBirth) {
        this(fullName, position, email, phone, salary, 0);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate localDate = LocalDate.parse(dateOfBirth, formatter);
            this.age = Period.between(localDate, LocalDate.now()).getYears();
        } catch (DateTimeParseException e) {
            System.out.println("Некорректный формат даты рождения (должна быть в формате dd.mm.yyyy)");
        }
    }

    public void printEmployeeInfo() {
        System.out.printf("Employee: fullName='%s', position='%s', email='%s', phone='%s', salary=%.2f, age=%d\n",
                fullName, position, email, phone, salary, age);
    }
}
