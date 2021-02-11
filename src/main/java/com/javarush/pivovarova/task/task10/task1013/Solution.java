package com.javarush.pivovarova.task.task10.task1013;
//Напиши класс Human с 6 полями.
//Придумай и реализуй 10 различных конструкторов для него.
public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private int growth;
        private int weight;
        private String ethnicity;

        public Human(String name) {
            this.name = name;
        }

        public Human(String surname, int age) {
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age, int growth, int weight, String ethnicity) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
            this.ethnicity = ethnicity;
        }

        public Human(String surname, int age, int growth) {
            this.surname = surname;
            this.age = age;
            this.growth = growth;
        }

        public Human(String name, int age, int growth, int weight) {
            this.name = name;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int growth, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int growth, String ethnicity) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.growth = growth;
            this.ethnicity = ethnicity;
        }

        public Human(int age, int growth, int weight) {
            this.age = age;
            this.growth = growth;
            this.weight = weight;
        }

        public Human(String name, String surname, int weight, String ethnicity) {
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.ethnicity = ethnicity;
        }
    }
}
