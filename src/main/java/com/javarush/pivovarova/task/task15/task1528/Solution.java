package com.javarush.pivovarova.task.task15.task1528;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Файл в статическом блоке
Для решения этой задачи:
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */

    public class Solution {
        public static List<String> lines = new ArrayList<String>();
        static {
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
                    String str;
                    while ((str = reader.readLine())!= null) {
                        lines.add(str);
                    }
                }
                catch (IOException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
        }
        public static void main(String[] args) {
            System.out.println(lines);
        }
    }
