package org.example;

import java.util.ArrayList;
public class test4 {

    public static void main(String[] args) {
        int G = args.length; // Длина массива
        float F = 0; // Сумма чисел масива
        ArrayList<Integer> Nums = new ArrayList<Integer>(); //Инициализация коллекции
        for (int i = 0; i < G; i++) {
            Nums.add(Integer.parseInt(args[i]));
            F = F + Integer.parseInt(args[i]);
        }
        int Y = 0; // Число шагов
        float D = F / G; // Временная переменная для вычисления
        int T = Math.round(D); // Число к которому нужно сводить массив
        for (int i = 0; i < G; i++) { //Цикл подсчета шагов
            if (Nums.get(i) > T) {
                Y= Y +Nums.get(i) - T;


            } else if (Nums.get(i) < T) {
                Y = Y +T - Nums.get(i);

            } else { //В случае равенства числа из массива и среднего значения ничего не делаем
            }
        } System.out.println(Y);
    }
}

