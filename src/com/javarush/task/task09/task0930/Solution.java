package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;
import java.util.stream.Stream;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }




    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        boolean[] index = new boolean[array.length];
        ArrayList<String> word = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                index[i] = true;
                number.add(Integer.parseInt(array[i]));
            } else {
                index[i] = false;
                word.add(array[i]);
            }
        }
        Object[] subWord = word.stream().toArray();
        Arrays.sort(subWord);
        Object[] subNumber = number.stream().toArray();
        Arrays.sort(subNumber, Collections.reverseOrder());
        int wordIndex = 0;
        int numberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (index[i] == true) {
                array[i] = Integer.toString((Integer) subNumber[numberIndex]);
                numberIndex++;
            } else {
                array[i] = (String) subWord[wordIndex];
                wordIndex++;
            }
        }
        String a = "а";
        String b = "р";
        boolean poher = isGreaterThan(a,b);
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
