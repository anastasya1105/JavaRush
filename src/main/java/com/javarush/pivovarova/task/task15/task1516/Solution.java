package com.javarush.pivovarova.task.task15.task1516;

/*
Значения по умолчанию
В этой задаче тебе нужно:
Создать 7 public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()
*/

public class Solution {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intVar);
        System.out.println(sol.doubleVar);
        System.out.println(sol.DoubleVar);
        System.out.println(sol.booleanVar);
        System.out.println(sol.ObjectVar);
        System.out.println(sol.ExceptionVar);
        System.out.println(sol.StringVar);
    }
}
