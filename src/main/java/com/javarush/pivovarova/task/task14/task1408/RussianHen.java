package com.javarush.pivovarova.task.task14.task1408;

public class RussianHen  extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 12;
    }
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth()+ " яиц в месяц.";
        return str;
    }

}
