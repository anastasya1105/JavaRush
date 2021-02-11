package com.javarush.pivovarova.task.task14.task1408;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 13;
    }
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
        return str;
    }
}
