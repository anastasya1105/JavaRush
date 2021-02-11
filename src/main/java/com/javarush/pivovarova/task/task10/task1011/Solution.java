package com.javarush.pivovarova.task.task10.task1011;
//Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
//
//        Образец:
//        Я не хочу изучать Java, я хочу большую зарплату
//        не хочу изучать Java, я хочу большую зарплату
//        не хочу изучать Java, я хочу большую зарплату
//        е хочу изучать Java, я хочу большую зарплату
//        хочу изучать Java, я хочу большую зарплату
//        хочу изучать Java, я хочу большую зарплату
//        ...
//        зарплату
public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = text.toCharArray();
        for (int i = 0; i < 40; i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = i; j < chars.length; j++) {
                buffer.append(chars[j]);
            }
            System.out.println(buffer);
        }

    }
}
