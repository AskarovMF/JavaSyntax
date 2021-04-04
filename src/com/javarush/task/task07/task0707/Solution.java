package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList <String>();
        list.add ("Java");
        list.add("Rush ");
        list.add("is ");
        list.add("the ");
        list.add("best!");
        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++) System.out.println(list.get(i));
    }
}
