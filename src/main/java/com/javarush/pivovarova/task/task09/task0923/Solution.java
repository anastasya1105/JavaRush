package com.javarush.pivovarova.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1. первая строка содержит только гласные буквы из введённой строки.
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//Пример ввода:
//Мама мыла раму.
//
//Пример вывода:
//а а ы а а у
//М м м л р м .
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] result = str.toCharArray();
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            isVowel(result[i]);
            if (isVowel(result[i]) == true) {
                buffer1.append(result[i]).append(' ');
            }
            if (isVowel(result[i]) == false && result[i] != ' ') {
                buffer2.append(result[i]).append(' ');
            }
        }
        System.out.println(buffer1);
        System.out.println(buffer2);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
