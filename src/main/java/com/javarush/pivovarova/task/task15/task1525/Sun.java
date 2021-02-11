package com.javarush.pivovarova.task.task15.task1525;

public class Sun implements Planet {
    private static Sun instance;

    private Sun() {
    }
    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
