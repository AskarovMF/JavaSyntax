package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char [] subString = string.toCharArray();
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> sogl = new ArrayList<>();
        for (char x: subString) {
            boolean i = isVowel(x);
            if (i){
                glas.add(x);
            }
            else if (x!=' '){
                sogl.add(x);
            }
        }
        for (Character x: glas) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (Character x: sogl) {
            System.out.print(x + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}