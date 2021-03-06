package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int dl = s.length();
        int ch = Integer.parseInt(s);
        for (int i = 0; i < dl; i++) {
            if (ch / (int)Math.pow(10,i) % 2  == 0) even++;
            else odd++; }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
