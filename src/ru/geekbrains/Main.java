package ru.geekbrains;

import java.util.Scanner;

public class Main {

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d –
//    входные параметры этого метода;

    byte aByte = 0;
    short aShort = 0;
    static int anInt = 0;
    long aLong = 0;
    float aFloat = 0f;
    static double aDouble = 0.0;
    boolean aBoolean = false;
    char aChar = 'a';

    String string = "Эта текстовая строка"; // or null для ссылочных типов

    private static double doMath (double a, double b, double c, double d) {
       if (d != 0) {
           return a * (b + (c / d));
       } else {
           System.out.println("Попытка деления на ноль. Проверьте значение параметра 'd'  " +
                   "doMath (double a, double b, double c, double d)");
           return 0;
       }
    }

    private static boolean checkLimit (int first, int second) {
        int s = first + second;
        return s >= 10 & s <= 20;
    }

    /*
     *  Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль положительное ли число передали,
     * или отрицательное; Замечание: ноль считаем положительным числом.
     */
    private static void doRetPositiveOrNegative (int date) {
        if (date >= 0 ) {
            System.out.println("Введенное число "+date+" является положительным");
        } else {
            System.out.println("Введенное число "+date+" является отрицательным");
        }

     }

     /*
      *  6. Написать метод, которому в качестве параметра передается целое число,
      *  метод должен вернуть true, если число отрицательное;
      */

    private static boolean isNegative (double data) {
        return data < 0;
    }

    /*
     * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
     *    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    private static void getName (String name) {
        System.out.println("Привет, " + name);
    }

    /*
     * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    private static void isLeapYear (int year) {


        if (year % 4 != 0) {
            System.out.println("Год "+year+" не является високосным");
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) System.out.println(year +" високосный год,");
                else  System.out.println("Год "+year+" не является високосным");
            } else  System.out.println(year +" високосный год,");
       }
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
        System.out.println("Введите первое число a: " );
        a = scanner.nextDouble();
        System.out.println("Введите второе число b: " );
        b = scanner.nextDouble();
        System.out.println("Введите третье число c: " );
        c = scanner.nextDouble();
        System.out.println("Введите четвертое число d: " );
        d = scanner.nextDouble();
        Main.aDouble = doMath(a, b, c, d);
        System.out.println ("Результат вычисления a * (b + (c / d)): " + Main.aDouble);
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
        // проверим введенное числа на положительное или отрицательное
        System.out.println();
        System.out.println("===================================================");
        System.out.println();
        System.out.println("Введите целое число: ");
        anInt = scanner.nextInt();
        doRetPositiveOrNegative(anInt);

//        Проверим является ли число отрицательным
        System.out.println("Введите число, если число < 0 метод вернет true, иначе false ");
        double n = scanner.nextDouble();
        System.out.println(isNegative(n));

        // Приветствие:
        System.out.println("Напишите свое имя!");
        getName(scanner.next());

        System.out.println("Введите год в формате YYYY, например 2020");
        anInt = scanner.nextInt();
        isLeapYear (anInt);

    }

}
