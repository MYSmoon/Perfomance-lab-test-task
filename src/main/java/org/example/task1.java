package org.example;
import java.util.*;

//Выведение пути кругового массива
public class task1 {
    public static void main(String[] args) {
        String n = args[0]; //Получение аргумента кругового массива
        String m = args[1]; //Получение аргумента обхода массива
       int g = 0; //индекс list
        Integer j = 1;
        Integer h = Integer.parseInt(n); //Переданный аргумент в виде обертки
        ArrayList<Integer> list = new ArrayList<Integer>();   //инициализация коллекции для записи переменных которые пойдут в вывод
       Integer T = Integer.parseInt(m); // Обход кругового массива
        T = T - 1;

        for (int i = 0; i < 100; i++) {
            list.add(g,j);
            g = g++;
            j = j + T;
            if (j > h) {
                j = j - h;
            }
            if (list.contains(j)) {
                i = i+100;
            }
        }
        for (int i = list.size()-1 ; i >= 0; i--) {
          System.out.println(list.get(i));
        }
     }
        }








