package com.javarush.pivovarova.task.task09.task0914;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {

            method1();
        }
        catch (Exception3 a) {
            System.out.println(a);
        }
         catch (Exception2 b) {
            System.out.println(b);
        }
         catch (Exception1 c) {
            System.out.println(c);
        }


    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
