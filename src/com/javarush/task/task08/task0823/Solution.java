package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char [] result = string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        list.add(Character.toUpperCase(result[0]));
        for (int i = 1; i<result.length; i++){
            if (result[i-1]==' '){
                list.add(Character.toUpperCase(result[i]));
            }
            else list.add(result[i]);
        }
        for (Character x:list
             ) {
            System.out.print(x);
        }


        //напишите тут ваш код
    }
}
