package com.javarush.pivovarova.task.task09.task0912;

public class Solution {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
        //напишите тут ваш код
}
