package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i;
       
        for (i=1; i<101; i++){
            double k = i%2;
            if (k==0){
            System.out.println(i);
           }
        }

    }
}
