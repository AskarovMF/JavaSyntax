package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] array = s.toCharArray();
        int index = 0;
        for (int i=0; i<array.length-7; i++){
            for (int j= index; j<array.length; j++){
                System.out.print(array[j]);
            }
            System.out.println();
            index++;
        }

        //напишите тут ваш код
    }

}

