package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int i = 0;
        if (a<=b & a<=c & a<=d & a<=e)
            i = a;
        else if (a>=b & b<=c & b<=d & b<=e)
            i=  b;
        else if (a>=c & b>=c & c<=d & c<=e)
            i=  c;
        else if (a>=d & b>=d & c>=d & e>=d)
            i = d;
        else if (e<=a & e<=b & e<=c & d<=e)
            i = e;
        return i;
    }
}
