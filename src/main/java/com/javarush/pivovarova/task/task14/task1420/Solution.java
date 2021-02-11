package com.javarush.pivovarova.task.task14.task1420;
/*
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int one = Integer.parseInt(reader.readLine());
            int two = Integer.parseInt(reader.readLine());
            if (one <= 0 || two <= 0) {
                throw new Exception();
            }
            ArrayList<Integer> num = new ArrayList<>();
            int max = 1;
            for (int i = 1; i <= one; i++) {
                if (one % i == 0) {
                    num.add(i);
                }
            }
            for (int i = 0; i < num.size(); i++) {
                int a = num.get(i);
                if (two % a == 0) {
                    max = a;
                }
            }
            System.out.println(max);
    }
}