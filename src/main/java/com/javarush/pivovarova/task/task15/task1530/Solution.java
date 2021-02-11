package com.javarush.pivovarova.task.task15.task1530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (дробные числа разделяются точкой);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URLname = reader.readLine();
        String parametrs = URLname.substring(URLname.indexOf('?')+1);
        String[] paramArray = parametrs.split("&");
            for (String str : paramArray) {
                String[] param = str.split("=");
                String string = param[0];
                System.out.print(string + " ");
            }
        System.out.println("");
            for (String str : paramArray) {
                if (str.contains("obj")) {
                    String[] param = str.split("=");
                    String string = param[1];
                    try {
                        double a = Double.valueOf(string);
                        alert(a);
                    }
                    catch (NumberFormatException e) {
                        alert(string);
                    }
                }
            }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
