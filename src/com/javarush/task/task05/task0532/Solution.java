package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int i;
        int j;
        int maximum = Integer.parseInt(reader.readLine());
        for (i=1; i<n; i++) {
            j = Integer.parseInt(reader.readLine());
            if (j>=maximum) maximum = j;
         }
        System.out.println(maximum);
    }
}
