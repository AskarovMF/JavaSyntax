package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i= 0; i<10; i++)
            list.add(reader.readLine());
        int a = list.get(0).length();
        String kor = list.get(0);
        for (int i = 0; i<list.size(); i++){
            int b = list.get(i).length();
            if (a>b){
                a=b;
                kor = list.get(i);
            }
        }
        int k = 0;
        for (int i=0; i<list.size();i++){
            if (kor == list.get(i)){
                k=i;
                break;
            }
        }
        int b = list.get(0).length();
        String dlin = list.get(0);
        for (int i=0; i<list.size(); i++){
            int c = list.get(i).length();
            if (b<c){
                b=c;
                dlin = list.get(i);
            }
        }
        int r = 0;
        for (int i=0; i<list.size(); i++){
            if (dlin==list.get(i)){
                r=i;
                break;
            }
        }
        if (k<r) System.out.println(kor);
        else if (k>r) System.out.println(dlin);
    }
}
