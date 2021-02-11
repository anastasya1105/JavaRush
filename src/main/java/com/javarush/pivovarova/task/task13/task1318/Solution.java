package com.javarush.pivovarova.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
В этой задаче тебе нужно:
Считать с консоли имя файла.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        InputStream inStream = new FileInputStream(name);
        Scanner s = new Scanner(inStream).useDelimiter("\\A");

        while (inStream.available() > 0)
        {
            String result = s.hasNext() ? s.next() : "";
            System.out.println(result);
        }

        inStream.close(); //закрываем потоки
        reader.close();
    }
        // напишите тут ваш код
}
