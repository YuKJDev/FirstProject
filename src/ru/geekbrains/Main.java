package ru.geekbrains;

public class Main {
    byte aByte = 0;
    short aShort = 0;
    int anInt = 0;
    long aLong = 0;
    float aFloat = 0f;
    static double aDouble = 0.0;
    boolean aBoolean = false;
    char aChar = 'a';

    String string = "Эта текстовая строка"; // or null для ссылочных типов

    public static double doMath (double a, double b, double c, double d) {
       if (d != 0) {
           return a * (b + (c / d));
       }
        return 0;
    }


    public static void main(String[] args) {
	// write your code here
        aDouble = doMath(10,20,19,30);
        System.out.print(aDouble);
    }
}
