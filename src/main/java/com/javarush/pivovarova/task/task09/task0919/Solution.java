package com.javarush.pivovarova.task.task09.task0919;

public class Solution {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static void divideByZero() {
        int c = 6 / 0;
        System.out.println(c);
    }

}
