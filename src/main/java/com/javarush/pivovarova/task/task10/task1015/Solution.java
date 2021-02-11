package com.javarush.pivovarova.task.task10.task1015;
import java.util.ArrayList;

//Создай массив, элементами которого будут списки строк.
//Заполни массив любыми данными и выведи их на экран.

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        for (int i = 0, j = 1578; i < array.length; i++, j = j * 16) {
            list1.add("bfedrh "+ j);
            list2.add("nWVEF " + 2*j);
            list3.add("cwkriurewjf " + 3*j);
        }
        array[0] = list1;
        array[1] = list2;
        array[2] = list3;
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
