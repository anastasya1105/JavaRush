package com.javarush.pivovarova.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
В методе main добавить в статический объект list 5 нитей.
Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SpecialThread thre = new SpecialThread();
            Thread thread = new Thread(thre);
            list.add(thread);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
