package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<10; i++) list.add(reader.readLine());
        int index = 0;
        for (int i = 0; i<9;){
            if (list.get(i).length()<list.get(i+1).length()) i++;
            else {
                index=i+1;
                break;
            }
        }
        if (index!=0) System.out.println(index);
    }
}

