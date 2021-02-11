package com.javarush.pivovarova.task.task12.task1212;

/*
«Исправь код», часть 1
Исправь код, чтобы программа компилировалась.

Подсказка: метод getChild должен остаться абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
