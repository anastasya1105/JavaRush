package com.javarush.pivovarova.task.task09.task0906;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[2].getClassName();
        String metod = stackTraceElements[2].getMethodName();
        String parametr = text;
        System.out.println(className + ": " + metod + ": " + parametr);

    }
}
