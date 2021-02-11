package com.javarush.pivovarova.task.task15.task1520;
/*
void getRightCup() - выбрать подходящую чашку;
void putIngredient() - положить ингредиенты;
void pour() - залить жидкость.
В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток
в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
