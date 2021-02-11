package com.javarush.pivovarova.task.task09.task0905;

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int dee = stackTraceElements.length;
        System.out.println(dee);
        return dee;//напишите тут ваш код
    }
}
