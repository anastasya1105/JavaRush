package com.javarush.pivovarova.task.task16.task1618;
/*
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread test = new TestThread();
        test.start();
        test.interrupt();
    }
    public static class TestThread extends Thread {
        public void run(){

        }
    }
}
