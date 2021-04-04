package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String [] subString;
        subString = string.split("-");
        int [] data = new int[subString.length];
        int i =0;
        for (String x: subString) {
                data[i] = Integer.parseInt(x);
                i++;
        }
        int year = data[0];
        int month=data[1];
        int day = data[2];
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(df.format(calendar.getTime()).toUpperCase());
        Date date =new Date();
    }
}
