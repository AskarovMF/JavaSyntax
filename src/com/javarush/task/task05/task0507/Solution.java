package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0, sa = 0, num=0;
        while (true) {
            double n = Integer.parseInt(reader.readLine());
            if (n==-1) {
                break;
            }
            num++;
            sa = (sum+=n)/num;
        }
        System.out.println(sa);

    }
}

