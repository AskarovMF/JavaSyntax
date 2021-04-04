package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // кол-во строк, вводимое в список
        int M = Integer.parseInt(reader.readLine()); // кол-во строк, перемещаемое вниз

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i<N; i++)
            list.add(reader.readLine());

        for (int i = 0; i<M;) {
            list.add(list.size() - 1, list.remove(i));
            M-=1;
        }

        for (String x:list
             ) {
            System.out.println(x);
        }

        //напишите тут ваш код
    }
}
