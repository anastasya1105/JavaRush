package com.javarush.pivovarova.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList();
        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                numbers.add(number);
            }
        }
        catch (Exception e) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }

        }
    }
}
