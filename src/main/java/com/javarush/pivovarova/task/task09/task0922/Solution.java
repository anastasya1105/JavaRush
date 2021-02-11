package com.javarush.pivovarova.task.task09.task0922;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
//Ввести с клавиатуры дату в формате "2013-08-18"
//Вывести на экран введенную дату в виде "AUG 18, 2013".
//Воспользоваться объектом Date и SimpleDateFormat.
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dat = reader.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
            Date date = formatter.parse(dat);
            System.out.println(format.format(date).toUpperCase());
    }
}
