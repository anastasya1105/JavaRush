package com.javarush.pivovarova.task.task10.task1012;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
// Результат выведи на экран в алфавитном порядке.
//
//Пример вывода:
//а 5
//б 8
//в 3
//г 7
//д 0
//...
//я 9

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                char cha = Character.toLowerCase(chars[j]);
                if (letters.containsKey(cha))
                {
                    letters.put(chars[j ],letters.get(cha) + 1);
                }
                else {
                    letters.put(cha, 1);
                }
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            char cha = Character.toLowerCase(alphabet.get(i));
            if (letters.containsKey(cha))
            {
                continue;
            }
            else {
                letters.put(cha, 0);
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            char a = alphabet.get(i);
            System.out.println(a + " " + letters.get(a));
        }
        // напишите тут ваш код
    }
}
