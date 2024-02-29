package ru.astondev;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 300},
                        {400, 500, 600},
                        {700, 800, 900}};
        AppData appData = new AppData(header, data);
        appData.save(appData);

        //checking how data is read from a file
        AppData newAppData = (new AppData()).read();
        System.out.println(newAppData.toString());
    }
}
