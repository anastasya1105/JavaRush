package com.javarush.pivovarova.task.task09.task0926;

import java.util.ArrayList;
//Создать список, элементами которого будут массивы чисел.
//Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
//Заполнить массивы любыми данными и вывести их на экран.
public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{4, 2, 6, 12, 64});
        list.add(new int[]{19, 3});
        list.add(new int[]{7, 182, 65, 72});
        list.add(new int[]{11, 9, 112, 51, 67, 82, 39});
        list.add(new int[]{});

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
