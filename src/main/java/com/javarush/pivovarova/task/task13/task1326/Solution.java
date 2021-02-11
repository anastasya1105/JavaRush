package com.javarush.pivovarova.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        InputStream inStream = new FileInputStream(name);
        Scanner s = new Scanner(inStream).useDelimiter("\\A");
        try {
            String a = s.nextLine();
            while (!a.equals("")) {
                int num = Integer.parseInt(a);
                if (num%2 == 0) {
                    list.add(num);
                }
                a = s.nextLine();
            }

        }
        catch (Exception e) {
            int u = list.size();
            int[] array = new int[u];
            for (int j = 0; j < list.size(); j++) {
                array[j] = list.get(j);
            }
            int n;
            boolean need = true;
            while (need == true) {
                need = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i-1] > array[i]) {
                        n = array[i-1];
                        array[i-1] = array[i];
                        array[i] = n;
                        need = true;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        inStream.close();
    }
}
