package com.javarush.pivovarova.task.task12.task1207;

/*
Int и Integer
Реализуй два метода: print(int) и print(Integer).
Напиши такой код в методе main(), чтобы вызвались оба.
*/

public class Solution {
    public static void main(String[] args) {
        Integer d = 12;
        int f = d;
        print(f);
        print(d);
    }

    public static void print(int a) {
        System.out.println(a+" 1");
    }
    public static void print(Integer b) {
        System.out.println(b+" 2");
    }
}
