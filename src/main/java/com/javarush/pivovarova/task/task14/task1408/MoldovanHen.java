package com.javarush.pivovarova.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - Moldova. Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
        return str;
    }
}
