package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++)
            list.add(i,reader.readLine());
        int a = list.get(0).length();
        String kor = list.get(0);
        for (int i = 0; i<5; i++){
            int b = list.get(i).length();
            if (a>=b){
                a=b;
                kor = list.get(i);
            }
        }
        for (int i = 0; i<5; i++){
            if (kor.length() == list.get(i).length()) System.out.println(list.get(i));
        }

    }
}
