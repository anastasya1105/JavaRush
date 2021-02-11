package com.javarush.pivovarova.task.task14.task1408;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 14;
    }
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
        return str;
    }
}
