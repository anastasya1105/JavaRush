package com.javarush.pivovarova.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/*
Писатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Вывести абсолютно все введенные строки в файл, каждую строчку — с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        OutputStream outStream = new FileOutputStream(name);
        String str1 = reader.readLine();
        while (!str1.equals("exit")) {
            String str2 = str1 + System.lineSeparator();
            byte[] buf = str2.getBytes();
            outStream.write(buf);
            str1 = reader.readLine();
        }
        byte[] buf = "exit".getBytes();
        outStream.write(buf);
        writer.close();
    }
}
