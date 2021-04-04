package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> number = new ArrayList<Integer>(); // создал 4 списка и проинициировал их
        ArrayList<Integer> numberForThree = new ArrayList<Integer>();
        ArrayList <Integer> numberForTwo = new ArrayList<Integer>();
        ArrayList<Integer> trash = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i =0; i<20; i++){
            number.add(Integer.parseInt(reader.readLine())); // записал 20 строк
        }

        for (int i = 0; i<number.size(); i++) {
            int x = number.get(i);
            if (x % 3 == 0 | x % 2 == 0) {
                if (x % 3 == 0) numberForThree.add(x);
                if (x % 2 == 0) numberForTwo.add(x);
            }
            else trash.add(x);
        }

        printList(numberForThree);
        printList(numberForTwo);
        printList(trash);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x: list) {
            System.out.println(x);
        }
    }
}
