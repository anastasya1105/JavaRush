package com.javarush.pivovarova.task.task15.task1524;
/*
Два раза перегрузи в классе Tree метод info(Object s) так, чтобы получилось три метода:
info(Object s), info(Number s), info(String s).
Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
Например, для метода info(Number s) результат может быть таким: "Дерево № 123 , метод Number, параметр Short".
 */
public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }
    public void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
    }
    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }

}
