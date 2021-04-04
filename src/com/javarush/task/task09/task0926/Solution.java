package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> subList = new ArrayList<>();
        subList.add(new int[5]);
        subList.add(new int[2]);
        subList.add(new int[4]);
        subList.add(new int[7]);
        subList.add(new int[0]);
        for (int[] array : subList) {
            for (int x : array) {
                int num = 0;
                x = num;
                num++;
            }
        }
        return subList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
