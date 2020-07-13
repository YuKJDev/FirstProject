package ru.geekbrains;

import java.util.Scanner;

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
       } else {
           System.out.println("Попытка деления на ноль. Проверьте значение параметра 'd'  " +
                   "doMath (double a, double b, double c, double d)");
           return 0;
       }
    }

    private static boolean checkLimit (int first, int second) {
        int summ = first + second;
        return summ >= 10 & summ <= 20;
    }


    public static void main(String[] args) {
	// write your code here
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        int first = 0;
        int second = 0;
        System.out.println("Введите значения: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый параметр a: " );
        a = scanner.nextDouble();
        System.out.println("Введите второй параметр b: " );
        b = scanner.nextDouble();
        System.out.println("Введите третий параметр c: " );
        c = scanner.nextDouble();
        System.out.println("Введите четвертый параметр d: " );
        d = scanner.nextDouble();
        aDouble = doMath(a, b, c, d);
        System.out.println ("Результат вычисления a * (b + (c / d)): " + aDouble);
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
        System.out.println("Введите 2 целых числа: ");
        System.out.println("Введите первое число: " );
        first = scanner.nextInt();
        System.out.println("Введите второе число: " );
        second = scanner.nextInt();
        if (checkLimit(first, second)) System.out.println("Сумма введенных чисел находиться в " +
                "диапазоне 10 <= sum <= 20 " + checkLimit(first, second) );
        else System.out.println("Сумма введенных чисел не находиться в " +
                "диапазоне 10 <= sum <= 20 " + checkLimit(first, second) );
    }
}
