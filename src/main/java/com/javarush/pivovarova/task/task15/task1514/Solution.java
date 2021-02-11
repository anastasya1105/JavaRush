package com.javarush.pivovarova.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Статики-1
В статическом блоке инициализируй labels пятью различными парами ключ-значение.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(3.15, "3.15");
        labels.put(7.18, "7.18");
        labels.put(6.25, "6.25");
        labels.put(3.39, "3.39");
        labels.put(9.76, "9.76");
        }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
