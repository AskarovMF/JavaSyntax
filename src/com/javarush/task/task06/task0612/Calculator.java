package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int plus = a+b;
        return plus;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int minus = a-b;
        return minus;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mul = a*b;
        return mul;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double div = (double) a/b;
        return div;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double per = (a*(double)b)/100;
        return per;
    }

    public static void main(String[] args) {

    }
}