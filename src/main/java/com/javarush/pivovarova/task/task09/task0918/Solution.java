package com.javarush.pivovarova.task.task09.task0918;

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends RuntimeException {
    }
}
