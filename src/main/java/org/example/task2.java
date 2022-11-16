package org.example;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class task2 {
    public static void main(String[] args) {

        float x1 = 0; // Х Вершины окружности
        float y1 = 0; // Y Вершины окружности
        float radius = 0;
        float x2 = 0; // Х Заданной точки
        float y2 = 0; // Y Заданной точки
        float z1 = 0; //Разность координат по X
        float z2 = 0; // Разность координат по Y
        double p1 = 0; // Квадрат одного катета
        double p2 = 0; // Квадрат второго катета
        double p3 = 0; // Сумма квадратов катета
        double p4 = 0; // Квадрат гипотенузы (Квадрат радиуса)
        //Вывод данных из первго аргумента
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(args[0]), StandardCharsets.UTF_8)) {
            List<String> lines1 = Files.readAllLines(
                    Paths.get(args[0]), StandardCharsets.UTF_8);
            radius = Float.parseFloat(lines1.get(1));
            String CircleDot = lines1.get(0);
            //Занесение данных из аргумента в переменные
            String[] CircleCoordinate = CircleDot.split(" ");
            x1 = Float.parseFloat(CircleCoordinate[0]);
            y1 = Float.parseFloat(CircleCoordinate[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Занесение данных из вторго аргумента
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(args[1]), StandardCharsets.UTF_8)) {
            List<String> lines2 = Files.readAllLines(
                    Paths.get(args[1]), StandardCharsets.UTF_8);
            for (int i = 0; i < lines2.size(); i++) {
                String Dot = lines2.get(i);
                String[] CircleCoordinate = Dot.split(" ");
                x2 = Float.parseFloat(CircleCoordinate[0]);
                y2 = Float.parseFloat(CircleCoordinate[1]);
                if (x1 > x2) {
                    z1 = x1 - x2;
                } else {
                    z1 = x2 - x1;
                }
                if (y1 > y2) {
                    z2 = y1 - y2;
                } else {
                    z2 = y2 - y1;
                }
                    p1 = Math.pow(z1, 2);
                    p2 = Math.pow(z2, 2);
                    p3 = p1+p2;
                    p4 = Math.pow(radius,2);
                if (p3 == p4) {
                    System.out.println("0");
                }if (p3 > p4) {
                        System.out.println("2");
                    } else {
                        System.out.println("1");
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}