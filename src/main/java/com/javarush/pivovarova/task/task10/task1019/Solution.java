package com.javarush.pivovarova.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
//
//Ключевые требования:
//Пустая строка - конец ввода данных.
//Числа могут повторяться.
//Строки всегда уникальны.
//Введенные данные не должны потеряться!
//Затем программа должна выводить содержание HashMap на экран.
//Каждую пару - с новой строки.
//
//Пример ввода:
//1
//Мама
//2
//Рама
//1
//Мыла
//
//Пример вывода:
//1 Мыла
//2 Рама
//1 Мама

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String s = reader.readLine();
            if ("".equals(s)) {
                break;
            }
            String a = reader.readLine();
            if ("".equals(a)) {
                map.put(s, 0);
                break;
            }
            try {
                int p = Integer.parseInt(s);
                map.put(a,p);
            }
            catch (NumberFormatException e) {
                try {
                    int c = Integer.parseInt(a);
                    String b = reader.readLine();
                    map.put(s, 0);
                    map.put(b,c);
                }
                catch (NumberFormatException k) {
                    continue;
                }
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
