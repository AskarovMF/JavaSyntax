package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<>();
        map.put("Аскаров", 500);
        map.put("Мирзоев", 200);
        map.put("Ремеле", 10000);
        map.put("Кузин", 70);
        map.put("Лихачев", 123);
        map.put("Роммель", 999);
        map.put("Иванов", 100);
        map.put("Рогов", 700);
        map.put("Пирогов", 18);
        map.put("Дорогов", 455);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        /*ArrayList<Integer> list = new ArrayList<>(map.values());
        for (int i=0; i<list.size(); i++){
            if (list.get(i)<500){
                
            }
        }*/
        Map<String,Integer> copy = new HashMap<>(map);
        Iterator<Map.Entry<String,Integer>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            if (pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
        /*for (Map.Entry<String,Integer> pair: map.entrySet()) {
            if (pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }*/
    }

    public static void main(String[] args) {
        /*Map<String,Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String,Integer> pair: map.entrySet()) {
            System.out.println(pair);
        }*/

    }
}