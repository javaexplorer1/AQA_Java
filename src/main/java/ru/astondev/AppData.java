package ru.astondev;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(AppData dataApp) {
        StringBuilder builder = new StringBuilder();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("text.csv"))) {
            builder.append(String.join(";", dataApp.header)).append(System.lineSeparator());
            writer.write(builder.toString());
            for (int[] row : dataApp.data) {
                builder.setLength(0);
                for (int item : row) {
                    builder.append(item).append(";");
                }
                builder.setLength(builder.length() - 1);
                builder.append(System.lineSeparator());
                writer.write(builder.toString());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл");
            e.printStackTrace();
        }
    }

    public AppData read() {
        AppData appData = null;
        String string;
        String[] newHeader = null;
        int[][] newData = null;
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("text.csv"))) {
            if ((string = reader.readLine()) != null) {
                newHeader = string.split(";");
            }
            while ((string = reader.readLine()) != null) {
                list.add(string);
            }
            newData = new int[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                String[] stringsArray = list.get(i).split(";");
                newData[i] = new int[stringsArray.length];
                for (int j = 0; j < stringsArray.length; j++) {
                    newData[i][j] = Integer.parseInt(stringsArray[j]);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении данных из файла");
            e.printStackTrace();
        }
        return new AppData(newHeader, newData);
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.deepToString(header) +
                ", data=" + Arrays.deepToString(data) +
                '}';
    }
}
