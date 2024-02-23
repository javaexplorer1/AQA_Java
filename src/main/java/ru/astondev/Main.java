package ru.astondev;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Romanov Andrey Nikolaevich", "manager", "manager@company.ru", "+79215865489", 75000, 35);
        //calling an alternative constructor:
        //Employee employee = new Employee("Romanov Andrey Nikolaevich", "manager", "manager@company.ru", "+79215865489", 75000, "11.02.1989");
        employee.printEmployeeInfo();
        System.out.println();

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Morozov Sergey Petrovich", "director", "info@company.ru", "+79115865489", 175000, 45);
        employeeArray[1] = new Employee("Petrov Aleksey Mikhailovich", "manager", "sales@company.ru", "+79113465492", 100000, 36);
        employeeArray[2] = new Employee("Popov Nikolay Ivanovich", "developer", "dev@company.ru", "+79818385485", 165000, 25);
        employeeArray[3] = new Employee("Smirnov Sergey Danilovich", "QA engineer", "quality@company.ru", "+79226295490", 150000, 23);
        employeeArray[4] = new Employee("Ivanov Andrey Nikolaevich", "designer", "design@company.ru", "+79821354934", 145000, 34);
        for (Employee someEmployee : employeeArray) {
            someEmployee.printEmployeeInfo();
        }
        System.out.println();

        Park park = new Park();
        park.addAttraction(park.new Attraction("Карусель", "10.00-18.00", 200));
        park.addAttraction(park.new Attraction("Американские горки", "10.00-19.00", 300));
        park.addAttraction(park.new Attraction("Поезд", "10.00-18.00", 100));
        park.addAttraction(park.new Attraction("Ракета", "10.00-18.00", 100));
        for (Park.Attraction parkAttraction : park.getParkAttractions()) {
            parkAttraction.printAttractionInfo();
        }
    }
}
