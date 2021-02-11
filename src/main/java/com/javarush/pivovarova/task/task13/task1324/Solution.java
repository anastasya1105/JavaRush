package com.javarush.pivovarova.task.task13.task1324;

import java.awt.*;

/*
Один метод в классе
Унаследуй Fox от интерфейса Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что методы удалять нельзя.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default Color getColor(){
            return Color.BLACK;
        }

        default Integer getAge(){
            return 3;
        }
    }

    public static class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}