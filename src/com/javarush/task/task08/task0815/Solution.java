package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Аскаров","Марат");
        map.put("Болдырев","Иван");
        map.put("Дедищев","Алеша");
        map.put("Рубин","Иван");
        map.put("Иванов","Костя");
        map.put("Петров","Лазарь");
        map.put("Сидоров","Костя");
        map.put("Водкин","Дмитрий");
        map.put("Малевич","Дмитрий");
        map.put("Штейнман","Дмитрий");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int x = 0;
        ArrayList<String> list = new ArrayList<>();
        list.addAll(map.values());
        for (int i = 0; i<list.size();i++){
            if (list.get(i).equals(name)){
                x+=1;
            }
        }
        return x;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int x = 0;
        ArrayList<String> list = new ArrayList<>();
        list.addAll(map.keySet());
        for (int i = 0; i<list.size();i++){
            if (list.get(i).equals(lastName)){
                x+=1;
            }
        }
        return x;

    }

    public static void main(String[] args) {

    }
}
