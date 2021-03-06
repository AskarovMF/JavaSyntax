package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums [] = new int[5];
        for (int i=0; i<5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<5; i++){
            int a = nums[i];
            for (int j = i-1; j>=0; j--){
                int leftNumber = nums[j];
                if (a<leftNumber){
                    nums[j+1]=leftNumber;
                    nums[j] = a;
                }
            }
        }

        for (int n: nums)
            System.out.println(n);



    }
}
