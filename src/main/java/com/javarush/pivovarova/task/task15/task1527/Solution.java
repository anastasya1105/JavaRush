package com.javarush.pivovarova.task.task15.task1527;

/*
Порядок загрузки переменных
Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
Поставь брейкпойнты и используй дебаггер.
Исправь порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name
*/

public class Solution {
    static {
        System.out.println("static void init()");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
/*
Static block
static void init()
public static void main
Non-static block
static void printAllFields
null
0
Solution constructor
static void printAllFields
First name
6

Process finished with exit code 0

 */
