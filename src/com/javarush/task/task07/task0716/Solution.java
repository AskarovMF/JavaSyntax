package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("мама");
        strings.add("лира");
        strings.add("река");
        strings = fix(strings);

        for (String string : strings) {
           System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i =0; i<strings.size();) {
            boolean litterR = strings.get(i).contains("р");
            boolean litterL = strings.get(i).contains("л");
            if (!litterR & !litterL){
                i++;
            }
            else if (litterR & litterL){
                i++;
            }
            else if (litterR) {
                strings.remove(i);
            }
            else if (litterL){
                strings.add(i+1,strings.get(i));
                i+=2;
            }
        }
        return strings;
        }


    }
