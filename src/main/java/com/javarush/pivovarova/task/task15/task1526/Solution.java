package com.javarush.pivovarova.task.task15.task1526;

/*
Перегрузка конструкторов
Чтобы решить эту задачу:
Создай 4 конструктора с разными модификаторами доступа в классе Solution.
В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).
*/

public class Solution {
    String name;
    int age;
    int ccbja;

    public Solution(String name) {
        this.name = name;
    }

    protected Solution(int age) {
        this.age = age;
    }

    Solution(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Solution(String name, int age, int ccbja) {
        this.name = name;
        this.age = age;
        this.ccbja = ccbja;
    }

    public static void main(String[] args) {
    }
}
