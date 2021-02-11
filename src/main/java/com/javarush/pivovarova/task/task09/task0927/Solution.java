package com.javarush.pivovarova.task.task09.task0927;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Есть класс кот - Cat, с полем "имя" (String).
//Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//Получить из Map множество(Set) всех котов и вывести его на экран.

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Barsic", new Cat("Barsic"));
        map.put("Leopold", new Cat("Leopold"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Murka", new Cat("Murka"));
        map.put("Felix", new Cat("Felix"));
        map.put("Vaska", new Cat("Vaska"));
        map.put("Mashka", new Cat("Mashka"));
        map.put("Cat", new Cat("Cat"));
        map.put("Fabia", new Cat("Fabia"));
        map.put("Marta", new Cat("Marta"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
