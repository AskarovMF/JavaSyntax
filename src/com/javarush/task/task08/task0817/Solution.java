package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Аскаров","Марат");
        map.put("Баширов","Репа");
        map.put("Валидов","Марат");
        map.put("Гадов","Саня");
        map.put("Дидаров","Ручка");
        map.put("Кострыков","Репа");
        map.put("Рыков","Река");
        map.put("Липов","Рука");
        map.put("Фигов","Сон");
        map.put("Родин","Ян");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String>list = new ArrayList<>();
        list.addAll(map.values());
        for (int i = 0; i<list.size()-1; i++){
            for (int j = i+1; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    removeItemFromMapByValue(map, list.get(i));
                    //System.out.println(list.get(i));
                }
            }
        }
     }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String,String> pair: map.entrySet()) {
            System.out.println(pair);
       }*/
    }
}
