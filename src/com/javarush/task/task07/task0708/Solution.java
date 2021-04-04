package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++) strings.add(i, reader.readLine());
        for (int i = 0; i<strings.size(); i++){
            String a = strings.get(i);
            int num = a.length();

            for (int j = i-1; j>=0; j--) {
                String b = strings.get(j);
                int leftNum = b.length();
                if (num<leftNum) {
                    strings.set(j + 1, b);
                    strings.set(j, a);
                }
            }
        }
        System.out.println(strings.get(4));
        for (int i = 4; i>=0; i--){
            if (strings.get(i).length() == strings.get(i-1).length())
                System.out.println(strings.get(i-1));
            else
                break;
        }
    }
}
