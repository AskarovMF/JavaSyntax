package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] num = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<15; i++)
            num[i]=Integer.parseInt(reader.readLine());
        int chet = 0;
        int nechet = 0;
        for (int j=0; j<15; j++)
            if (j%2==0)
                chet+=num[j];
            else
                nechet+=num[j];
        String result = chet>nechet? "В домах с четными номерами проживает больше жителей.": "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);

    }
}
