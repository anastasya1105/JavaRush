package com.javarush.pivovarova.task.task09.task0903;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String n = stackTraceElements[2].getMethodName();
        int s = stackTraceElements[2].getLineNumber();
        return s;
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int s = stackTraceElements[1].getLineNumber();
        return s;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int s = stackTraceElements[1].getLineNumber();
        return s;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int s = stackTraceElements[1].getLineNumber();
        return s;
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int s = stackTraceElements[1].getLineNumber();
        return s;
    }
}
