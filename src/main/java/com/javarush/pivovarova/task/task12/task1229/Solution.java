package com.javarush.pivovarova.task.task12.task1229;

/*
Родитель класса CTO
Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public static class Worker implements Businessman {

        @Override
        public void workHard() {

        }
    }
    public static class CTO extends Worker implements Businessman {

    }
}